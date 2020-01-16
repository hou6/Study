package com.houliu.多线程操作.生消模式.生消2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author houliu
 * @create 2020-01-16 23:20
 */
public class Alternate {
    private int number = 1;
    private Lock lock = new ReentrantLock();
    private Condition conditionA = lock.newCondition();
    private Condition conditionB = lock.newCondition();
    private Condition conditionC = lock.newCondition();

    public void loopA(int loopTime){
        lock.lock();
        try {
            while (number != 1){
                conditionA.await();
            }
            System.out.println(Thread.currentThread().getName() + "\tnumber的值为：" + number + "\t第" + loopTime + "次循环");
            number = 2;
            conditionB.signal();
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void loopB(int loopTime){
        lock.lock();
        try {
            while (number != 2){
                conditionB.await();
            }
            System.out.println(Thread.currentThread().getName() + "\tnumber的值为：" + number + "\t第" + loopTime + "次循环");
            number = 3;
            conditionC.signal();
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void loopC(int loopTime){
        lock.lock();
        try {
            while (number != 3){
                conditionC.await();
            }
            System.out.println(Thread.currentThread().getName() + "\tnumber的值为：" + number + "\t第" + loopTime + "次循环");
            System.out.println("================================");
            number = 1;
            conditionA.signal();
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}
