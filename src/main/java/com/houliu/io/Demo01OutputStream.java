package com.houliu.io;

/**
 * @author houliu
 * @create 2020-01-12 23:41
 */

import java.io.FileOutputStream;
import java.io.IOException;

/**
 *  OutputStream : 字节输出流
 */
public class Demo01OutputStream {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos =
                new FileOutputStream("/Users/houliu/IdeaProjects/Study/src/main/java/com/houliu/io/h1.txt");
        fos.write("你好".getBytes());   //你好
        byte[] bytes = {65,66,67,68,69};
        fos.write(bytes);  //你好ABCDE
        fos.write(bytes,1,3);  //你好ABCDEBCD  off:1 -> 开始的索引，len：3 -> 写的长度
        fos.close();
    }

}
