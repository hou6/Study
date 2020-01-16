package com.houliu.多线程操作.阻塞队列;

/**
 * @author houliu
 * @create 2020-01-16 21:41
 */

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/**
 *  SynchronousQueue不存储元素,即单个元素的队列. 来一个取一个,没取走则不会添加
 */
public class SynchronousQueueDemo {
    public static void main(String[] args) {
        SynchronousQueue<String> synchronousQueue = new SynchronousQueue<>();
        new Thread(() -> {
            try {
                System.out.println(Thread.currentThread().getName() + "\t put 111");
                synchronousQueue.put("111");
                System.out.println(Thread.currentThread().getName() + "\t put 222");
                synchronousQueue.put("222");
                System.out.println(Thread.currentThread().getName() + "\t put 333");
                synchronousQueue.put("333");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "AAA").start();

        new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
                System.out.println(Thread.currentThread().getName() + "\t取出" + synchronousQueue.take());
                TimeUnit.SECONDS.sleep(2);
                System.out.println(Thread.currentThread().getName() + "\t取出" + synchronousQueue.take());
                TimeUnit.SECONDS.sleep(2);
                System.out.println(Thread.currentThread().getName() + "\t取出" + synchronousQueue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "BBB").start();
    }
}
