package com.houliu.多线程操作.线程练习;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author houliu
 * @create 2020-01-17 00:20
 */
public class PrintYibai {
    private int number = 1;
    private Lock lock = new ReentrantLock();
    private Condition conditionA = lock.newCondition();
    private Condition conditionB = lock.newCondition();

    public void printJI(){
        lock.lock();
        try {
            while (number <= 100){
                if (number % 2 == 0){
                    conditionA.await();
                }
                System.out.println(Thread.currentThread().getName() + "\t" + number);
                number++;
                conditionB.signal();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void printOU(){
        lock.lock();
        try {
            while (number <= 100){
                if (number % 2 != 0){
                    conditionB.await();
                }
                System.out.println(Thread.currentThread().getName() + "\t" + number);
                number++;
                conditionA.signal();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
