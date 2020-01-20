package com.houliu.设计模式.建造者模式.建造者模式2;

/**
 * @author houliu
 * @create 2020-01-18 16:53
 */
public class Test {
    public static void main(String[] args) {
        Worker worker = new Worker();  //工人，服务员之类

        /**
         * 链式编程,在原来的基础上可以自由组合,如果不组合,也有默认的
         */
        Product product = worker
                .buildA("Mate30Pro")
                .buildB("荣耀V30Pro")
                .buildC("Nova5Pro")
                .getProduct();
        System.out.println("product = " + product);
    }
}
