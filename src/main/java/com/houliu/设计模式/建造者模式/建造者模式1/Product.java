package com.houliu.设计模式.建造者模式.建造者模式1;

import lombok.Data;

/**
 * @author houliu
 * @create 2020-01-18 16:15
 */

/**
 * 需要建造的产品
 */
@Data
public class Product {

    /**
     * 建造需要的材料
     */
    private String buildA;
    private String buildB;
    private String buildC;
    private String buildD;

}
