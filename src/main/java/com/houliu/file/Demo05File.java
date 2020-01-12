package com.houliu.file;

import java.io.File;
import java.io.IOException;

/**
 * @author houliu
 * @create 2020-01-12 17:13
 */
public class Demo05File {

    public static void main(String[] args) throws IOException {
        File file = new File("/Users/houliu/Desktop/资料/File_IO.md");
        System.out.println(file.createNewFile());   //创建File_IO.md文件，存在不会创建，返回false，不存在才创建，返回true
        System.out.println(file.mkdirs());   //创建单级或多级文件夹，不存在，创建，返回true    存在，不创建，返回false
        System.out.println(file.mkdir());   //创建单级文件夹，不存在，创建，返回true    存在，不创建，返回false
        System.out.println(file.delete());  //文件删除，文件夹中有内容时，不会删除，返回false
    }

}
