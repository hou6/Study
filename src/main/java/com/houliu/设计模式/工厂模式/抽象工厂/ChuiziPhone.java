package com.houliu.设计模式.工厂模式.抽象工厂;

/**
 * @author houliu
 * @create 2020-01-18 15:49
 */
public class ChuiziPhone implements Phone {
    @Override
    public void callUp() {
        System.out.println("锤子手机打电话。。。。");
    }

    @Override
    public void sendSMS() {
        System.out.println("锤子手机发短信。。。。");
    }
}
