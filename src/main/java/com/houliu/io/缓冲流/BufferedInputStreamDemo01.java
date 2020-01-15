package com.houliu.io.缓冲流;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author houliu
 * @create 2020-01-14 14:07
 */
public class BufferedInputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream fis = new BufferedInputStream(new FileInputStream("/Users/houliu/IdeaProjects/Study/src/main/java/com/houliu/io/in.txt"));
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }
        fis.close();
    }
}
