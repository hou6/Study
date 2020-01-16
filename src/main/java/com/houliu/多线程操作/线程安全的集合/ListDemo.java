package com.houliu.多线程操作.线程安全的集合;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author houliu
 * @create 2020-01-17 01:05
 */
public class ListDemo {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();   //线程不安全
//        List<String> list = Collections.synchronizedList(new ArrayList<>());  //线程安全，相当于外面包了一层synchronized
//        List<String> list = new Vector<>();  //线程安全，但是效率低，一般不用    内部有synchronized修饰
        List<String> list = new CopyOnWriteArrayList<>();   //写时复制，读写分离，多线程中一般用它
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                list.add(UUID.randomUUID().toString().substring(5,10));
                System.out.println(list);
            }).start();
        }
    }
}
