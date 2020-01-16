package com.houliu.io.练习;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * @author houliu
 * @create 2020-01-16 12:45
 *
 *              <dependency>
     *             <groupId>commons-io</groupId>
     *             <artifactId>commons-io</artifactId>
     *             <version>2.5</version>
 *              </dependency>
 */
public class FileUtilsTest {
    public static void main(String[] args) throws IOException {
        File srcFile = new File("/Users/houliu/IdeaProjects/Study/src/main/java/com/houliu/io/练习/out.txt");
        File destFile = new File("/Users/houliu/IdeaProjects/Study/src/main/java/com/houliu/io/练习/out2.txt");
        FileUtils.copyFile(srcFile,destFile);  //复制文件

        FileUtils.deleteQuietly(destFile);  //删除文件
        FileUtils.deleteDirectory(srcFile);  //删除文件夹
    }
}
