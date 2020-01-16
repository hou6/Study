package com.houliu.多线程操作.CountDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * @author houliu
 * @create 2020-01-16 20:40
 */

/**
 * 做减法
 */
public class CountDownLatchDemo {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(6);
        for (int i = 1; i <= 6; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + "\t 国被灭...");
                countDownLatch.countDown();  //减一
            },CountryEnum.getCountryName(i)).start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("秦帝国，一统天下.....");
    }
}
