package com.houliu.多线程操作.线程安全的集合;

import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author houliu
 * @create 2020-01-17 01:17
 */
public class SetDemo {
    public static void main(String[] args) {
//        HashSet<String> set = new HashSet<>();  //线程不安全
//        Set<String> set = Collections.synchronizedSet(new HashSet<>());  //线程安全，相当于外面包了一层synchronized
        Set<String> set = new CopyOnWriteArraySet<>();   //写时复制，读写分离，多线程中一般用它
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                set.add(UUID.randomUUID().toString().substring(6,16).replace("-","+"));
                System.out.println(set);
            }).start();
        }
    }
}
