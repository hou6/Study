package com.houliu.io.转换流;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author houliu
 * @create 2020-01-14 16:07
 */
public class OutputStreamWriterDemo01 {
    public static void main(String[] args) throws IOException {
        write_u8();
        write_gbk();

    }

    private static void write_gbk() throws IOException {
        //可以指定编码格式  默认为u8
        OutputStreamWriter osw = new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream("/Users/houliu/IdeaProjects/Study/src/main/java/com/houliu/io/gbk.txt")),"GBK");
        osw.write("IDEA 你好");  //IDEA ���  用bgk写，u8打开，会乱码
        osw.flush();
        osw.close();
    }

    private static void write_u8() throws IOException {
        //可以指定编码格式  默认为u8
        OutputStreamWriter osw = new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream("/Users/houliu/IdeaProjects/Study/src/main/java/com/houliu/io/utf8.txt")),"UTF-8");
        osw.write("IDEA 你好");  //IDEA 你好    用u8写，u8打开，不会乱码
        osw.flush();
        osw.close();
    }
}
