package com.houliu.io.练习;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author houliu
 * @create 2020-01-13 15:15
 */
public class CopyFileDemo1 {

    /*
        使用字节流读取汉字
            GBK:一个汉字占两个字节
            UTF-8：一个汉字占三个字节
     */

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/houliu/IdeaProjects/Study/src/main/java/com/houliu/io/h2.txt");
        FileOutputStream fos = new FileOutputStream("/Users/houliu/IdeaProjects/Study/src/main/java/com/houliu/io/h3.txt");
        int len = 0;  //每次读取的有效字节个数
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
    }

}
