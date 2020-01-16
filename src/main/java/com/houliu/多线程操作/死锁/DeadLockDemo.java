package com.houliu.多线程操作.死锁;

/**
 * @author houliu
 * @create 2020-01-17 00:54
 */
public class DeadLockDemo implements Runnable {

    private String lockA;
    private String lockB;

    public DeadLockDemo(String lockA, String lockB) {
        this.lockA = lockA;
        this.lockB = lockB;
    }

    @Override
    public void run() {
        synchronized (lockA){
            System.out.println(Thread.currentThread().getName() + "\t已拥有LockA，尝试拥有LockB.....");
            synchronized (lockB){
                System.out.println(Thread.currentThread().getName() + "\t已拥有LockB，尝试拥有LockA.....");
            }
        }
    }
}
