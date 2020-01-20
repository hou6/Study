package com.houliu.设计模式.工厂模式.简单工厂;

/**
 * @author houliu
 * @create 2020-01-18 15:25
 */
public class CarFactory {

    public static Car getCar(String type){
        if (type.equals("五菱")){
            return new Wuling();
        }else if (type.equals("特斯拉")){
            return new Tesla();
        }else {
            return null;
        }
    }

}
