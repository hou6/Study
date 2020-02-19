package com.houliu.设计模式.适配器模式;

/**
 * @author houliu
 * @create 2020-02-19 16:09
 */

/**
 * 要上网的电脑
 */
public class Computer {

    public void net(Adapter adapter){
        adapter.handlerRequest();
    }

    public static void main(String[] args) {
        //new 网线、电脑、拓展钨
        Computer computer = new Computer();
        Adaptee adaptee = new Adaptee();
        Adapter adapter = new Adapter(adaptee);
        computer.net(adapter);
    }

}
