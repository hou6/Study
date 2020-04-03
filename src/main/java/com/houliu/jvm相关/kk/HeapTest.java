package com.houliu.jvm相关;

/**
 * @author houliu
 * @create 2020-03-17 17:04
 */
public class HeapTest {

    public static void main(String[] args) {
        long maxMemory = Runtime.getRuntime().maxMemory();  //返回虚拟机试图使用的最大内存量
        long totalMemory = Runtime.getRuntime().totalMemory();  //返回虚拟机中的最大内存量

        System.out.println("maxMemory = " + maxMemory/(double)1024/1024 + "M");
        System.out.println("totalMemory = " + totalMemory/(double)1024/1024 + "M");

    }

}
