package com.houliu.设计模式.建造者模式.建造者模式1;

/**
 * @author houliu
 * @create 2020-01-18 16:27
 */
public class Test {
    public static void main(String[] args) {
        Director director = new Director();
        Product product = director.getProduct(new Worker());
        System.out.println(product.toString());
    }
}
