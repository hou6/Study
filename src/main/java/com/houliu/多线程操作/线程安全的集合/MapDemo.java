package com.houliu.多线程操作.线程安全的集合;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author houliu
 * @create 2020-01-17 01:22
 */
public class MapDemo {
    public static void main(String[] args) {
//        Map<String, String> map = new HashMap<>();  //线程不安全
//        Map<String,String> map = Collections.synchronizedMap(new HashMap<>());  //线程安全，相当于外面包了一层synchronized
        Map<String,String> map = new ConcurrentHashMap<>();  //线程安全，java8之后采用锁分段机制
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                map.put(Thread.currentThread().getName(), UUID.randomUUID().toString().toUpperCase().substring(6,10));
                System.out.println(map);
            }).start();
        }
    }
}
