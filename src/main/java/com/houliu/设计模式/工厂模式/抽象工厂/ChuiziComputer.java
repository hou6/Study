package com.houliu.设计模式.工厂模式.抽象工厂;

/**
 * @author houliu
 * @create 2020-01-18 15:58
 */
public class ChuiziComputer implements Computer {
    @Override
    public void installQQ() {
        System.out.println("锤子TNT安装qq");
    }

    @Override
    public void installWechat() {
        System.out.println("锤子TNT安装wechat");
    }
}
