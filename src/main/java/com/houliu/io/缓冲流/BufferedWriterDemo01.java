package com.houliu.io.缓冲流;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author houliu
 * @create 2020-01-14 14:17
 */
public class BufferedWriterDemo01 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/houliu/IdeaProjects/Study/src/main/java/com/houliu/io/h5.txt"));
        for (int i = 0; i < 10; i++) {
            bw.write("nice to meet you");
            bw.newLine();  //换行
        }
        bw.flush();
        bw.close();
    }
}
