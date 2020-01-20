package com.houliu.设计模式.代理模式;

/**
 * @author houliu
 * @create 2020-01-18 17:11
 */
public class Test {
    public static void main(String[] args) {
        Host host = new Host();  //房东
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        proxyInvocationHandler.setObject(host);
        Rent rent = (Rent) proxyInvocationHandler.getProxy();
        rent.rent();

    }
}
