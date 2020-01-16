package com.houliu.多线程操作.生消模式.生消1;

/**
 * @author houliu
 * @create 2020-01-16 22:33
 */
public class Clerk {

    private int product = 0;

    //进货
    public synchronized void get(){
        while (product >= 1){
            System.out.println("商品已满。。。");
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + "生产，当前剩余\t" + ++product);
        this.notifyAll();
    }


    //卖货
    public synchronized void sale(){
        while (product <= 0){
            System.out.println("当前缺货。。。");
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + "买走，当前剩余\t" + --product);
        this.notifyAll();
    }

}
