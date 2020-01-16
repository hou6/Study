package com.houliu.多线程操作.手写线程池;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author houliu
 * @create 2020-01-17 00:07
 */
public class ThreadPoolDemo {

    public static void main(String[] args) {
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(
                2,     //核心线程数
                5,  //最大线程数
                2L,   //活跃时间
                TimeUnit.SECONDS,   //时间单位
                new LinkedBlockingDeque<>(3),   //等待队列
                Executors.defaultThreadFactory(),         //线程工厂
//                new ThreadPoolExecutor.AbortPolicy()      //拒绝策略,直接抛异常
//                new ThreadPoolExecutor.CallerRunsPolicy()  //拒绝策略，谁让他来的，让他去找谁
//                new ThreadPoolExecutor.DiscardOldestPolicy()  //拒绝策略，丢弃等待最久的
                new ThreadPoolExecutor.DiscardPolicy()          //拒绝策略，随机丢弃，当允许丢包时可以使用
                );

        //使用
        try {
            for (int i = 0; i < 100; i++) {
                threadPool.execute(() -> {
                    System.out.println(Thread.currentThread().getName() + "\t来办理业务了");
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            threadPool.shutdown();
        }
    }

}
