package com.houliu.io.打印流;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * @author houliu
 * @create 2020-01-15 15:10
 */
public class PrintWriterDemo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("/Users/houliu/IdeaProjects/Study/src/main/java/com/houliu/io/打印流/print2.txt");
        pw.println("nice");
        pw.println("to");
        pw.println("neet");
        pw.println("you");
        pw.println(true);
        pw.close();
    }
}
