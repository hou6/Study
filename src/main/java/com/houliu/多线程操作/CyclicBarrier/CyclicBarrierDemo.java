package com.houliu.多线程操作.CyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author houliu
 * @create 2020-01-16 20:53
 */

/**
 * CyclicBarrier  做加法
 */
public class CyclicBarrierDemo {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(7, () -> {
            System.out.println("已集齐7颗龙珠，召唤神龙.....");
        });

        for (int i = 1; i <= 7; i++) {
            new Thread(() -> {
                System.out.println( "已收集到" + Thread.currentThread().getName() + "星球");
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            },String.valueOf(i)).start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
