package com.houliu.多线程操作.自旋锁;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author houliu
 * @create 2020-01-16 20:23
 */

class SpinLock {
    AtomicReference<Thread> atomicReference = new AtomicReference<>();

    //上锁
    public void lock(){
        Thread thread = Thread.currentThread();
        System.out.println(Thread.currentThread().getName() + "\t invoke lock method...");
        //如果没有获取到锁，就通过CAS自旋   必须使用while或者do..while循环
        while (!atomicReference.compareAndSet(null,thread)) {
            //do nothing
        }
    }
    //解锁
    public void unlock(){
        Thread thread = Thread.currentThread();
        atomicReference.compareAndSet(thread,null);
        System.out.println(Thread.currentThread().getName() + "\t invoke unlock method...");
    }
}

public class SpinLockDemo {
    public static void main(String[] args) {
        SpinLock spinLock = new SpinLock();
        new Thread(() -> {
            spinLock.lock();
            //占据5秒锁
            try {
                TimeUnit.SECONDS.sleep(5L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            spinLock.unlock();
        },"t1").start();

        //睡1秒保证t1线程先执行
        try {
            TimeUnit.SECONDS.sleep(1L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(() -> {
            spinLock.lock();
            try {
                TimeUnit.SECONDS.sleep(1L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            spinLock.unlock();
        },"t2").start();
    }
}
