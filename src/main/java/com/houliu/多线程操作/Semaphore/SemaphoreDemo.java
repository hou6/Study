package com.houliu.多线程操作.Semaphore;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @author houliu
 * @create 2020-01-16 21:02
 */

/**
 *  Semaphore用于多个线程争抢有限资源    一般用于耍猴，抢购。。。
 */
public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);   //定义三个车位

        for (int i = 1; i <= 6; i++) {
            new Thread(() -> {
                try {
                    semaphore.acquire();   //占据资源
                    System.out.println(Thread.currentThread().getName() + "\t 抢到车位，将停车3秒");
                    TimeUnit.SECONDS.sleep(3);  //占据时长为3秒
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    semaphore.release();  //释放资源
                    System.out.println(Thread.currentThread().getName() + "\t 已停车3秒，我走了");
                }
            }).start();
        }
    }
}
