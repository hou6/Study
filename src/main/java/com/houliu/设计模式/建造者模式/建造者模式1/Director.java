package com.houliu.设计模式.建造者模式.建造者模式1;

/**
 * @author houliu
 * @create 2020-01-18 16:24
 */
public class Director {

    public Product getProduct(Builder builder){
        builder.buildA();
        builder.buildB();
        builder.buildC();
        builder.buildD();

        return builder.getProduct();
    }

}
