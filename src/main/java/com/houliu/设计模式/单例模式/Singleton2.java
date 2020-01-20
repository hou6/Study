package com.houliu.设计模式.单例模式;

/**
 * @author houliu
 * @create 2020-01-18 17:54
 */

/**
 * 静态内部类的形式的单例模式
 */
public class Singleton2 {

    private static volatile Singleton2 INSTANCE = null;
    public Singleton2(){}

    private static class Singleton22{
        private static final Singleton2 SINGLETON_2 = new Singleton2();
    }

    private static synchronized Singleton2 getInstance(){
        return Singleton22.SINGLETON_2;
    }

}
