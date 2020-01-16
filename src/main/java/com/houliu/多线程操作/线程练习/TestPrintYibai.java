package com.houliu.多线程操作.线程练习;

/**
 * @author houliu
 * @create 2020-01-17 00:40
 */
public class TestPrintYibai {
    public static void main(String[] args) {
        PrintYibai yibai = new PrintYibai();
        new Thread(() -> {
            yibai.printJI();
        },"奇数线程").start();

        new Thread(() -> {
            yibai.printOU();
        },"偶数线程").start();
    }
}
