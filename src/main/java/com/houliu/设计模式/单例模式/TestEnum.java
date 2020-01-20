package com.houliu.设计模式.单例模式;

/**
 * @author houliu
 * @create 2020-01-18 18:02
 */
public class TestEnum {
    public static void main(String[] args) {
        Singleton3 instance3 = Singleton3.INSTANCE;
        Singleton3 instance33 = Singleton3.INSTANCE;
        System.out.println(instance3 == instance33);
        instance3.sayHello();
        instance33.sayHello();
    }
}

enum Singleton3{
    INSTANCE
    ;

    public void sayHello(){
        System.out.println("hello... nice to meet you !!!");
    }
}

