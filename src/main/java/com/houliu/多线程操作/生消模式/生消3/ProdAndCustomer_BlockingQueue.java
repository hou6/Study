package com.houliu.多线程操作.生消模式.生消3;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @author houliu
 * @create 2020-01-16 23:35
 */
public class ProdAndCustomer_BlockingQueue {

    public static void main(String[] args) {
        MyResources myResources = new MyResources(new ArrayBlockingQueue<>(10));
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "\t启动");
            myResources.prod();
        },"生产者").start();

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "\t启动");
            myResources.Customer();
        },"消费者").start();

        try {
            TimeUnit.SECONDS.sleep(6L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("6秒时间到，结束。。。。");
        myResources.stop();
    }

}
