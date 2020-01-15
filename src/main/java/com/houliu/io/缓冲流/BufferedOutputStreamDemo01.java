package com.houliu.io.缓冲流;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author houliu
 * @create 2020-01-14 00:15
 */
public class BufferedOutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("/Users/houliu/IdeaProjects/Study/src/main/java/com/houliu/io/in.txt"));
        bos.write("利用字节缓冲流写入数据到文件".getBytes());
        bos.flush();
        bos.close();
    }
}
