package com.houliu.file;

import java.io.File;

/**
 * @author houliu
 * @create 2020-01-12 17:13
 */
public class Demo04File {

    public static void main(String[] args) {
        File file = new File("/Users/houliu/IdeaProjects/Study/hehe/q.txt");
        System.out.println(file.exists());   //判断file是否存在，返回true或false
        System.out.println(file.isFile());   //判断file是否是文件，返回true或false
        System.out.println(file.isDirectory());   //判断file是否是文件夹，返回true或false
    }

}
