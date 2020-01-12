package com.houliu.io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author houliu
 * @create 2020-01-13 01:01
 */
public class Demo03InputStream {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/houliu/IdeaProjects/Study/src/main/java/com/houliu/io/h1.txt");
        int len = 0;  //记录读取到的字节
        while ((len = fis.read()) != -1){
            System.out.println((char) len);   //ABCDE
        }

        fis.close();
    }

}
