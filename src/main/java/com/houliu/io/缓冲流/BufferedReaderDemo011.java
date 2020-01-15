package com.houliu.io.缓冲流;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author houliu
 * @create 2020-01-14 14:22
 */
public class BufferedReaderDemo011 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/Users/houliu/IdeaProjects/Study/src/main/java/com/houliu/io/h5.txt"));
//        int len = 0;
//        char[] chars = new char[1024];
//        while ((len = br.read(chars)) != -1){
//            System.out.println(new String(chars,0,len));
//        }
//        br.close();

        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
    }
}
