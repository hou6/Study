package com.houliu.设计模式.工厂模式.方法工厂;

/**
 * @author houliu
 * @create 2020-01-18 15:53
 */
public class XiaomiPhone implements Phone {
    @Override
    public void callUp() {
        System.out.println("小米手机打电话。。。。");
    }

    @Override
    public void sendSMS() {
        System.out.println("小米手机发短信。。。。");
    }
}
