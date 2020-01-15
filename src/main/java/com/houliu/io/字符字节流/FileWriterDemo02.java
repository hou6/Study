package com.houliu.io.字符字节流;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author houliu
 * @create 2020-01-13 16:04
 */
public class FileWriterDemo02 {
    public static void main(String[] args) throws IOException {
        char[] chars = {'a','b','c','d','e','f'};
        FileWriter fw = new FileWriter("/Users/houliu/IdeaProjects/Study/src/main/java/com/houliu/io/h2.txt");
        fw.write(chars);  //abcdef
        fw.write(chars,2,3);  //cde
        fw.write("美丽的小女孩");   //美丽的小女孩
        fw.write("美丽的小女孩",2,3);   //的小女
        fw.close();  //必须写，否则不能写入，或者flash
    }
}
