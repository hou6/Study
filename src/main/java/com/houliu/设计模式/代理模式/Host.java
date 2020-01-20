package com.houliu.设计模式.代理模式;

/**
 * @author houliu
 * @create 2020-01-18 17:02
 */

/**
 * 具体的实现类  房东
 */
public class Host implements Rent {

    @Override
    public void rent() {
        System.out.println("房东出租房子");
    }
}
