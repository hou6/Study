package com.houliu.设计模式.建造者模式.建造者模式1;

/**
 * @author houliu
 * @create 2020-01-18 16:19
 */

/**
 * 建造的工人，具体的实现
 */
public class Worker extends Builder {

    /**
     * 具体得到的产品
     */
    private Product product;

    public Worker() {
        product = new Product();   //这里必须new出来
    }

    @Override
    void buildA() {
        product.setBuildA("打地基");
        System.out.println("打地基");
    }

    @Override
    void buildB() {
        product.setBuildB("架钢筋");
        System.out.println("架钢筋");
    }

    @Override
    void buildC() {
        product.setBuildC("铺电线");
        System.out.println("铺电线");
    }

    @Override
    void buildD() {
        product.setBuildD("粉刷");
        System.out.println("粉刷");
    }

    @Override
    Product getProduct() {
        return product;
    }
}
