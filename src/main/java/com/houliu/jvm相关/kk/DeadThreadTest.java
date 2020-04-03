package com.houliu.jvm相关;

/**
 * @author houliu
 * @create 2020-03-02 17:53
 */

/**
 *      虚拟机必须保证一个类的  <clinit>()  方法在多线程下被同步加锁
 */
public class DeadThreadTest {

    public static void main(String[] args) {

        //应尽量避免这种写法
        Runnable r = () -> {
            System.out.println(Thread.currentThread().getName() + "开始");
            DeadThread deadThread = new DeadThread();
            System.out.println(Thread.currentThread().getName() + "结束");
        };

        new Thread(r,"线程1").start();
        new Thread(r,"线程2").start();

    }

}

class DeadThread{
    static {
        if (true){
            System.out.println(Thread.currentThread().getName() + "初始化当前类。。。。。。");
            while (true){

            }
        }
    }
}
