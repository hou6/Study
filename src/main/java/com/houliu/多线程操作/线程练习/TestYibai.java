package com.houliu.多线程操作.线程练习;

/**
 * @author houliu
 * @create 2020-01-17 00:52
 */
public class TestYibai {
    public static void main(String[] args) {
        Yibai yibai = new Yibai();
        new Thread(yibai,"线程A").start();
        new Thread(yibai,"线程B").start();
    }
}
