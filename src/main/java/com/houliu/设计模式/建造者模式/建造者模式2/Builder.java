package com.houliu.设计模式.建造者模式.建造者模式2;

/**
 * @author houliu
 * @create 2020-01-18 16:48
 */

/**
 * 建造者
 */
public abstract class Builder {

    abstract Builder buildA(String msg);
    abstract Builder buildB(String msg);
    abstract Builder buildC(String msg);
    abstract Builder buildD(String msg);

    //得到的产品
    abstract Product getProduct();

}
