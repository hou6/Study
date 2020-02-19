package com.houliu.设计模式.桥接模式;

/**
 * @author houliu
 * @create 2020-02-19 16:42
 */
public class Test {

    public static void main(String[] args) {
        //组合一个：联想台式机
        Computer computer = new DeskTop(new Lenovo());
        computer.info();
        //组合一个：苹果笔记本
        Computer computer1 = new Laptop(new Apple());
        computer1.info();
        //组合一个联想笔记本
        Computer computer2 = new Laptop(new Lenovo());
        computer2.info();
        //组合一个苹果台式机
        Computer computer3 = new DeskTop(new Apple());
        computer3.info();
    }

}
