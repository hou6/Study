package com.houliu.多线程操作.单线程;

/**
 * @author houliu
 * @create 2020-04-26 21:48
 * 线程礼让  yield，
 *         让当前正在执行的线程暂停，但不阻塞
 *         让线程从运行状态转为就绪状态
 *         让CPU从新调度，礼让不一定成功，看CPU心情
 */
public class TestYield {
    public static void main(String[] args) {
        MyYield myYield = new MyYield();
        new Thread(myYield,"线程1").start();
        new Thread(myYield,"线程2").start();

    }
}

class MyYield implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "开始执行。。。。");
        Thread.yield();  //线程礼让
        System.out.println(Thread.currentThread().getName() + "结束执行。。。。");
    }
}
