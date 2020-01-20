package com.houliu.设计模式.单例模式;

/**
 * @author houliu
 * @create 2020-01-18 17:51
 */

/**
 * 单例模式   --双端检索机制
 */
public class Singleton {

    private static volatile Singleton INSTANCE = null;

    public Singleton(){

    }

    public static Singleton getInstance(){
        if (null == INSTANCE){
            synchronized (Singleton.class){
                if (null == INSTANCE){
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }

}
