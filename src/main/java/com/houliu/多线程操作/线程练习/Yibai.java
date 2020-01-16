package com.houliu.多线程操作.线程练习;

/**
 * @author houliu
 * @create 2020-01-17 00:46
 */
public class Yibai implements Runnable {

    private int number = 1;

    @Override
    public void run() {
        while (true){
            synchronized (this) {
                notify();
                if (number <= 100){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "\t" + number);
                    number++;
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
