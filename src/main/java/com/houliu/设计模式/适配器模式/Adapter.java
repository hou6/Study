package com.houliu.设计模式.适配器模式;

/**
 * @author houliu
 * @create 2020-02-19 16:04
 */

/**
 * 适配器，可以理解为一个拓展钨
 *
 * 可以使用继承和组合的方式
 * 继承：类适配器，单继承
 * 组合：对象适配器，推荐使用，可以实现类似热拔插方式
 */
public class Adapter implements NetToUsb {

    //传入 adaptee ，连接网线
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handlerRequest() {
        adaptee.request();
    }
}
