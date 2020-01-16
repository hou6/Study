package com.houliu.多线程操作.生消模式.生消2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author houliu
 * @create 2020-01-16 23:22
 */
public class TestAlternate {
    public static void main(String[] args) {
        Alternate alternate = new Alternate();
        ExecutorService threadPool = Executors.newFixedThreadPool(3);
        threadPool.submit(() -> {
            for (int i = 1; i <= 3; i++) {
                alternate.loopA(i);
            }
        });

        threadPool.submit(() -> {
            for (int i = 1; i <= 3; i++) {
                alternate.loopB(i);
            }
        });

        threadPool.submit(() -> {
            for (int i = 1; i <= 3; i++) {
                alternate.loopC(i);
            }
        });

        threadPool.shutdown();
    }
}
