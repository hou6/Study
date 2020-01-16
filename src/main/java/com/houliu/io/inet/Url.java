package com.houliu.io.inet;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author houliu
 * @create 2020-01-16 17:01
 */
public class Url {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:3306?username=zhangsan&password=123456");
        System.out.println(url.getProtocol());  //获取url协议
        System.out.println(url.getPort());   //获取url端口
        System.out.println(url.getPath());    //获取url文件路径
        System.out.println(url.getFile());    //获取url文件名
        System.out.println(url.getQuery());   //获取该url的查询名
        System.out.println(url.getHost());    //获取主机名
    }
}
