package com.houliu.file;

import java.io.File;

/**
 * @author houliu
 * @create 2020-01-12 17:13
 */
public class Demo08File {

    public static void main(String[] args) {
        File file = new File("/Users/houliu/IdeaProjects/Study/src/main/java/com/houliu/file");
        getAllFile(file);
    }

    private static void getAllFile(File file){
        System.out.println(file);
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isDirectory()){
                getAllFile(file1);
            }else {
                System.out.println(file1);
            }
        }
    }

}
