package com.houliu.io.转换流;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author houliu
 * @create 2020-01-14 16:16
 */
public class InputStreamReaderDemo01 {
    public static void main(String[] args) throws IOException {
        read_u8();
        read_gbk();
    }

    private static void read_gbk() throws IOException {
        InputStreamReader isr = new InputStreamReader(new BufferedInputStream(new FileInputStream("/Users/houliu/IdeaProjects/Study/src/main/java/com/houliu/io/utf8.txt")), "utf-8");
        int len = 0;
        char[] chars = new char[1024];
        while ((len = isr.read(chars)) != -1){
            System.out.println(new String(chars,0,len));
        }
        isr.close();
    }

    private static void read_u8() throws IOException {
        InputStreamReader isr = new InputStreamReader(new BufferedInputStream(new FileInputStream("/Users/houliu/IdeaProjects/Study/src/main/java/com/houliu/io/utf8.txt")), "gbk");
        int len = 0;
        char[] chars = new char[1024];
        while ((len = isr.read(chars)) != -1){
            System.out.println(new String(chars,0,len));
        }
        isr.close();
    }
}
