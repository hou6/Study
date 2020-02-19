package com.houliu.设计模式.桥接模式;

/**
 * @author houliu
 * @create 2020-02-19 16:36
 */

/**
 * 抽象类
 */
public abstract class Computer {
    //组合，品牌、电脑
    protected Brand brand;
    public Computer(Brand brand) {
        this.brand = brand;
    }
    public void info(){
        brand.info();  //自带品牌
    }
}

class DeskTop extends Computer{

    public DeskTop(Brand brand) {
        super(brand);
    }
    @Override
    public void info() {
        super.info();
        System.out.println("【台式机】");
    }
}

class Laptop extends Computer{

    public Laptop(Brand brand) {
        super(brand);
    }
    @Override
    public void info() {
        super.info();
        System.out.println("【笔记本】");
    }
}
