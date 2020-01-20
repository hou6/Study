package com.houliu.设计模式.建造者模式.建造者模式2;

/**
 * @author houliu
 * @create 2020-01-18 16:47
 */

import lombok.Data;

/**
 * 需要建造的产品
 */

@Data
public class Product {

    /**
     * 套餐
     */
    private String buildA = "汉堡";
    private String buildB = "可乐";
    private String buildC = "薯条";
    private String buildD = "甜点";

}
