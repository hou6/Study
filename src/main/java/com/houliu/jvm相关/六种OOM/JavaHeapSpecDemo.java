package com.houliu.jvm相关.六种OOM;

import java.util.Random;

/**
 * @author houliu
 * @create 2020-04-03 22:18
 *
 * 注意：运行时配置 -Xms10m -Xmx10m,分配较小的堆内存
 */
public class JavaHeapSpecDemo {

    public static void main(String[] args) {
        String str = "houliu";

        while (true){
            str += str + new Random().nextInt(1111111111) + new Random().nextInt(222222222);
            str.intern();
        }
    }

}
