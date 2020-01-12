package com.houliu.file;

import java.io.File;

/**
 * @author houliu
 * @create 2020-01-12 17:13
 */
public class Demo06File {

    public static void main(String[] args) {
        File file = new File("/Users/houliu/IdeaProjects/Study/src/main/java/com/houliu/file");
        String[] list = file.list();   //获取该目录下的所有文件的名称，返回值是string类型，它可以获取到系统中的隐藏文件
        for (String fileName : list) {
            System.out.println(fileName);
        }

        File[] files = file.listFiles();   //获取该目录下所有文件，返回值是file类型
        for (File file1 : files) {
            System.out.println(file1);
        }
    }

}
