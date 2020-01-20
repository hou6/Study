package com.houliu.设计模式.建造者模式.建造者模式1;

/**
 * @author houliu
 * @create 2020-01-18 16:17
 */

/**
 * 建造者
 */
public abstract class Builder {

    /**
     * 建造的步骤
     */
    abstract void buildA();
    abstract void buildB();
    abstract void buildC();
    abstract void buildD();

    /**
     * 完工，得到的产品
     */
    abstract Product getProduct();

}
