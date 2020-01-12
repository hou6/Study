package com.houliu.io;

/**
 * @author houliu
 * @create 2020-01-12 23:41
 */

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * OutputStream : 字节输出流
 */
public class Demo02OutputStream {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos =
                new FileOutputStream("/Users/houliu/IdeaProjects/Study/src/main/java/com/houliu/io/h2.txt", true);   //true代表追加写，续写
        for (int i = 0; i < 10; i++) {
            fos.write("你好".getBytes());   //你好
            fos.write("\r\n".getBytes());  //换行
        }
        fos.close();
    }
}
