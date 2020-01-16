package com.houliu.多线程操作.CAS;

/**
 * @author houliu
 * @create 2020-01-17 01:31
 */

import java.util.concurrent.atomic.AtomicInteger;

/**
 *      CAS : compare and swap   比较并交换
 */
public class AtomicIntegerDemo {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();  //默认值是0
        System.out.println(atomicInteger.incrementAndGet());  //先加1再获取出
        System.out.println(atomicInteger.getAndIncrement());   //先获取出,再加1
        System.out.println(atomicInteger.getAndAdd(3));  //先取出，再加3
        System.out.println(atomicInteger.incrementAndGet());  //先加1再获取出
        System.out.println(atomicInteger.decrementAndGet());    //先减1再获取出
        System.out.println(atomicInteger.doubleValue());  //获取double值
        System.out.println(atomicInteger.get());  //获取值

        boolean boo = atomicInteger.compareAndSet(5, 2020);   //比较并交换
        System.out.println(boo);

    }
}
