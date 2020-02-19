package com.houliu.设计模式.适配器模式;

/**
 * @author houliu
 * @create 2020-02-19 16:00
 */

/**
 * 可以比做网线，需要被连接
 */
public class Adaptee {

    public void request(){
        System.out.println("我是网线，连接我可以上网。。。。");
    }

}
