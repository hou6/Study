package com.houliu.多线程操作.死锁;

/**
 * @author houliu
 * @create 2020-01-17 00:57
 */
public class TestDeadLock {
    public static void main(String[] args) {
        String lockA = "lockA";
        String lockB = "lockB";
        new Thread(new DeadLockDemo(lockA,lockB),"LockA").start();
        new Thread(new DeadLockDemo(lockB,lockA),"LockB").start();
    }
}
