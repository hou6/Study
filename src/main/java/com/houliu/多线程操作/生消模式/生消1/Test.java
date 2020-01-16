package com.houliu.多线程操作.生消模式.生消1;

/**
 * @author houliu
 * @create 2020-01-16 22:42
 */
public class Test {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Productor productor = new Productor(clerk);
        Customer customer = new Customer(clerk);
        new Thread(productor,"生产者").start();
        new Thread(customer,"消费者").start();
    }
}
