package com.houliu.jvm相关.六种OOM;

/**
 * @author houliu
 * @create 2020-04-03 22:14
 *
 *
 *          java.lang.StackOverflowError: 栈内存不够用
 */
public class stackOverflowError {

    public static void main(String[] args) {
        stackOverflowErrorDemo();
    }

    private static void stackOverflowErrorDemo() {
        stackOverflowErrorDemo();
    }

}
