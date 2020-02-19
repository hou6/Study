package com.houliu.设计模式.桥接模式;

/**
 * @author houliu
 * @create 2020-02-19 16:36
 */
public class Apple implements Brand {
    @Override
    public void info() {
        System.out.print("苹果");
    }
}
