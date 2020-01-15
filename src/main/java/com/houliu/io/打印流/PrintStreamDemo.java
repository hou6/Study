package com.houliu.io.打印流;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @author houliu
 * @create 2020-01-15 14:01
 */
public class PrintStreamDemo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("/Users/houliu/IdeaProjects/Study/src/main/java/com/houliu/io/打印流/print.txt");
        ps.write(97);
        ps.print(97);
        ps.println(true);
        ps.printf("有一个美丽的小女孩");  //不换行
        ps.println("nice to meet you !!!");  //换行
        ps.print("她的名字叫做小微");   //不换行
        System.setOut(ps);   //改变打印地址
        System.out.println("通过System.out可以改变输出语句的打印路径");
        ps.close();
    }
}
