package com.houliu.jvm相关;

/**
 * @author houliu
 * @create 2020-03-09 17:04
 */
public class OperandStackTest {

    //byte、short、char、boolean：都以 int 型来存储
    //非静态方法会多个this
    public void testAddOperation(){
        byte i = 15;
        int j = 8;
        int k = i + j;
    }

}
