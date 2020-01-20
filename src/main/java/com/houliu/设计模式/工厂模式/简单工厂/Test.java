package com.houliu.设计模式.工厂模式.简单工厂;

import java.io.*;

/**
 * @author houliu
 * @create 2020-01-18 15:27
 */
public class Test {
    public static void main(String[] args) {
        Car car = CarFactory.getCar(getType());
        car.name();
    }

    private static String getType(){
        System.out.println("请输入车型：五菱或者特斯拉");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
