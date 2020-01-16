package com.houliu.io.字符字节流;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author houliu
 * @create 2020-01-15 20:00
 */

/*
    RandomAccessFile直接继承于Object类
    它既可以作为输入流，也可以作为输出流
    如果写出到的文件不存在，则会自动创建，如果存在，进行覆盖(默认情况下，从头覆盖)

    第二个参数：
        r : 读
        rw : 读，写

 */
public class RandomAccessFileDemo {
    public static void main(String[] args) {
        RandomAccessFile raf1 = null;
        RandomAccessFile raf2 = null;
        try {
            raf1 = new RandomAccessFile("/Users/houliu/IdeaProjects/Study/src/main/java/com/houliu/io/字符字节流/h5.txt", "r");   //只读
            raf2 = new RandomAccessFile("/Users/houliu/IdeaProjects/Study/src/main/java/com/houliu/io/字符字节流/h6.txt", "rw");   //读写
            int len = 0;
            byte[] bytes = new byte[1024];
            while ((len = raf1.read(bytes)) != -1){
                raf2.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (raf2 != null){
                try {
                    raf2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (raf1 != null){
                try {
                    raf1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
