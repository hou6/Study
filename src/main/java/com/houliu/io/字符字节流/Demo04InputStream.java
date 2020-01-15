package com.houliu.io.字符字节流;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author houliu
 * @create 2020-01-13 01:01
 */
public class Demo04InputStream {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/houliu/IdeaProjects/Study/src/main/java/com/houliu/io/h1.txt");
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }
        fis.close();
    }

}
