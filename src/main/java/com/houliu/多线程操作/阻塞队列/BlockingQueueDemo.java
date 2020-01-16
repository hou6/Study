package com.houliu.多线程操作.阻塞队列;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @author houliu
 * @create 2020-01-16 21:34
 */
public class BlockingQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);

        System.out.println(blockingQueue.offer("张三", 2L, TimeUnit.SECONDS));  //往队列里装
        System.out.println(blockingQueue.offer("李四", 2L, TimeUnit.SECONDS));
        System.out.println(blockingQueue.offer("王武", 2L, TimeUnit.SECONDS));
//        blockingQueue.offer("猴六",2L, TimeUnit.SECONDS);  //3个已满，装不进去,会返回false

        System.out.println(blockingQueue.poll(2, TimeUnit.SECONDS));  //从队列里取
        System.out.println(blockingQueue.poll(2, TimeUnit.SECONDS));
        System.out.println(blockingQueue.poll(2, TimeUnit.SECONDS));
//        System.out.println(blockingQueue.poll(2, TimeUnit.SECONDS));  //没有可以取的了，返回null

    }
}
