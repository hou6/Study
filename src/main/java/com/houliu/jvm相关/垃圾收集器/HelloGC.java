package com.houliu.jvm相关.垃圾收集器;

import java.util.Random;

/**
 * @author houliu
 * @create 2020-04-04 16:55
 *
 * java -XX:+PrintCommandLineFlags -version : 可以查看JVM默认的垃圾收集器
 */
public class HelloGC {
    public static void main(String[] args) {
        String str = "houliu";

        while (true){
            str += str + new Random().nextInt(7777777) + new Random().nextInt(9999999);
            str.intern();
        }
    }

}
