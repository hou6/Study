package com.houliu.多线程操作.单线程;

/**
 * @author houliu
 * @create 2020-04-27 00:08
 *      测试守护线程
 *      上帝守护着你
 */
public class TestDaemonThread {
    public static void main(String[] args) {
        Thread god_thread = new Thread(new God());
        Thread you_thread = new Thread(new You());

        god_thread.setDaemon(true); //设置为守护线程，默认是用户线程，为false,正常的线程都是用户线程
        god_thread.start();

        you_thread.start();
    }
}

class God implements Runnable {

    @Override
    public void run() {
        while (true) {  //程序在you执行完毕后会停止
            System.out.println("我是上帝，我守护着你。。。");
        }
    }
}

class You implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 36500; i++) {
            System.out.println("活着的第" + i+ "天");
        }
        System.out.println("========== goodBye =========");
    }
}
