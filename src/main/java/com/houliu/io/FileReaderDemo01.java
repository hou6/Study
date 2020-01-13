package com.houliu.io;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author houliu
 * @create 2020-01-13 15:37
 */

/*
    字符输入流  FileReader
 */
public class FileReaderDemo01 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/Users/houliu/IdeaProjects/Study/src/main/java/com/houliu/io/h2.txt");
        int len = 0;  //记录的是每次读取的有效字符个数
        char[] chars = new char[1024];
        while ((len = fr.read(chars)) != -1){
            System.out.println(new String(chars,0,len));
        }
        fr.close();
    }
}
