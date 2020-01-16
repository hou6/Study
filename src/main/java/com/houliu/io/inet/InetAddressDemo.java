package com.houliu.io.inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author houliu
 * @create 2020-01-16 15:00
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();  //获取本地ip地址
        System.out.println("localHost = " + localHost);

        InetAddress inetAddress = InetAddress.getByName("www.baidu.com");   //获取百度的网络地址
        System.out.println("inetAddress = " + inetAddress);

        String hostAddress = inetAddress.getHostAddress();   //获取百度地址
        System.out.println("hostAddress = " + hostAddress);

        String hostName = inetAddress.getHostName();  //获取百度域名
        System.out.println("hostName = " + hostName);
    }
}
