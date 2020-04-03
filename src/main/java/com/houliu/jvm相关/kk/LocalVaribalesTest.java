package com.houliu.jvm相关;

import java.util.Date;

/**
 * @author houliu
 * @create 2020-03-09 14:07
 */
public class LocalVaribalesTest {

    public static void main(String[] args) {
        testStatic();
    }

    public static void testStatic(){
        String str = "houliu";
        Date date = new Date();
        int count = 10;
        System.out.println(count);
    }

}
