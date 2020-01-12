package com.houliu.file;

import java.io.File;

/**
 * @author houliu
 * @create 2020-01-12 17:45
 */
public class Demo02File {
    public static void main(String[] args) {
        show01();
        show02("c:","aaa.txt");
        show03();
    }

    private static void show03() {
//        File file = new File("c:", "hello");
        File file = new File("c:");
        File file1 = new File(file, "hello.txt");
        System.out.println(file1);
    }

    private static void show02(String parent,String child) {
        File file = new File(parent, child);
        System.out.println(file);
    }

    /**
     * File(String pathname):通过给定路径名字符串转换为抽象路径名来创建一个新的File实例
     *      参数： pathname  字符串的路径名称
     *          可以是文件结尾，也可以是文件夹结尾
     *          可以是相对路径，也可以是绝对路径
     *          路径可以是存在，也可以是不存在
     *          创建file对象，只是把字符串路径封装为File对象，不考虑路径的真假情况
     */
    private static void show01() {
        File file = new File("/Users/houliu/IdeaProjects/Study");
        System.out.println(file);  ///Users/houliu/IdeaProjects/Study  重写了object类的toString方法
    }
}
