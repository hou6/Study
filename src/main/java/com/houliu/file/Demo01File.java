package com.houliu.file;

import java.io.File;

/**
 * @author houliu
 * @create 2020-01-12 17:13
 */
public class Demo01File {

    public static void main(String[] args) {
        System.out.println(File.pathSeparator);   //路径分隔符   windows是分号; linux是冒号:
        System.out.println(File.separator);       //文件名称分隔符   windows是反斜杠\  linux是斜杠/
    }

}
