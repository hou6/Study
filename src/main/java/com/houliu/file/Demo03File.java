package com.houliu.file;

import java.io.File;

/**
 * @author houliu
 * @create 2020-01-12 17:13
 */
public class Demo03File {

    public static void main(String[] args) {
        File file = new File("hehe//q.txt");
        System.out.println(file.getAbsolutePath());  //获取绝对路径，绝对
        System.out.println(file.getPath());  //获取路径，传什么，返回什么
        System.out.println(file);
        System.out.println(file.toString());   //调用的就是getPath方法
        System.out.println(file.getName());
        System.out.println(file.length());  //返回的是文件的大小，以字节为单位，当传的是文件夹或不存在的文件时，返回值为0
    }

}
