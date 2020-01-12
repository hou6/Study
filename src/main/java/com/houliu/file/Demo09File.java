package com.houliu.file;

import java.io.File;
import java.io.FileFilter;

/**
 * @author houliu
 * @create 2020-01-12 17:13
 */
public class Demo09File {

    public static void main(String[] args) {

        File file = new File("D:\\aaa");

    }

    private static void f(File file){
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java");
            }
        });


        for (File file1 : files) {
            if (file1.isDirectory()) {
                f(file1);
            }else {
                System.out.println(file1);
            }
        }
    }

}
