package com.houliu.io.字符字节流;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author houliu
 * @create 2020-01-13 15:47
 */

/*
    字符输出流，写数据
 */
public class FileWriterDemo01 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("/Users/houliu/IdeaProjects/Study/src/main/java/com/houliu/io/h1.txt",true);  //加个true，追加写入，不会覆盖
        for (int i = 0; i < 10; i++) {
            fw.write("nice to meet you !!!");
            fw.write("\r\n");
//            fw.flush();   //将内存缓冲区的数据刷新到文件中，刷新缓冲区，流对象可以继续使用
        }
        fw.close();   //也可以把缓冲区的数据刷新到文件中，先刷新缓冲区，然后通知系统释放资源，流对象不能再被使用了
    }
}
