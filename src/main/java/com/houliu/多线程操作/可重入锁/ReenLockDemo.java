package com.houliu.多线程操作.可重入锁;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author houliu
 * @create 2020-01-16 20:02
 */

/**
 *   可重入锁的简单demo   synchronized和ReentrantLock默认都是非公平的可重入锁,也叫递归锁
 */
class phone implements Runnable {

    private static Lock lock = new ReentrantLock();

    public void get(){
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + "\t invoke get method");
            set();
        }finally {
            lock.unlock();
        }
    }

    public void set(){
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + "\t invoke set method");
        }finally {
            lock.unlock();
        }
    }

    @Override
    public void run() {
        get();
    }

    public synchronized void sendSMS(){
        System.out.println(Thread.currentThread().getName() + "\t invoke sendSMS method");
        sendEmail();
    }

    public synchronized void sendEmail(){
        System.out.println(Thread.currentThread().getName() + "\t invoke sendEmail method");
    }
}

public class ReenLockDemo {
    public static void main(String[] args) {
        phone phone = new phone();
        new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            phone.sendSMS();
        },"t3").start();

        new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            phone.sendEmail();
        },"t4").start();

        new Thread(phone,"t1").start();
        new Thread(phone,"t2").start();

    }
}
