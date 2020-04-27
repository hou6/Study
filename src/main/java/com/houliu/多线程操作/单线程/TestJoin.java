package com.houliu.多线程操作.单线程;

/**
 * @author houliu
 * @create 2020-04-26 22:05
 *      join()让一个线程等待另外一个线程完成才继续执行。
 *      如果线程A执行体中调用B线程的join()方法，则A线程将会被阻塞，直到B线程执行完为止，A才能得以继续执行
 */
public class TestJoin {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Myjoin());
        for (int i = 0; i < 100; i++) {
            if (i == 22){
                thread.start();
                thread.join();
            }
            System.out.println("我是main" + i);
        }
    }
}

class Myjoin implements Runnable{

    @Override
    public void run() {
        System.out.println("下面有100个VIP要执行，main线程先等一下.....");
        for (int i = 0; i < 100; i++) {
            System.out.println("我是VIP" + i);
        }
        System.out.println("100个VIP执行完毕了，main线程可以开始执行了.....");
    }
}
