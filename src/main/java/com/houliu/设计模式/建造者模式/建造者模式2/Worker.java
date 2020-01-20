package com.houliu.设计模式.建造者模式.建造者模式2;

/**
 * @author houliu
 * @create 2020-01-18 16:50
 */
public class Worker extends Builder {

    private Product product;
    public Worker(){
        product = new Product();
    }

    @Override
    Builder buildA(String msg) {
        product.setBuildA(msg);
        return this;
    }

    @Override
    Builder buildB(String msg) {
        product.setBuildB(msg);
        return this;
    }

    @Override
    Builder buildC(String msg) {
        product.setBuildC(msg);
        return this;
    }

    @Override
    Builder buildD(String msg) {
        product.setBuildD(msg);
        return this;
    }

    @Override
    Product getProduct() {
        return product;
    }
}
