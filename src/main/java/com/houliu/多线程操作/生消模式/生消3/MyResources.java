package com.houliu.多线程操作.生消模式.生消3;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author houliu
 * @create 2020-01-16 23:35
 */
public class MyResources {

    private volatile boolean FLAG = true;
    private AtomicInteger atomicInteger = new AtomicInteger();
    private BlockingQueue<String> blockingQueue = null;

    public MyResources(BlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    public void prod() {
        try {
            String data = null;
            boolean reValue;
            while (FLAG){
                data = atomicInteger.incrementAndGet() + "";
                reValue = blockingQueue.offer(data, 2L, TimeUnit.SECONDS);
                if (reValue){
                    System.out.println(Thread.currentThread().getName() + "\t插入数据" + data + "\t成功");
                }else {
                    System.out.println(Thread.currentThread().getName() + "\t插入数据" + data + "\t失败");
                }
                TimeUnit.SECONDS.sleep(1L);
            }
            System.out.println(Thread.currentThread().getName() + "主人叫停了，表示FLAG=false了，停止生产....");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void Customer() {
        try {
            String data = null;
            while (FLAG){
                data = blockingQueue.poll(2L,TimeUnit.SECONDS);
                if (null == data || data.equalsIgnoreCase("")){
                    FLAG = false;
                    System.out.println(Thread.currentThread().getName() + "\t超过两秒没有取到数据，消费者退出");
                    return;  //直接退出
                }
                System.out.println(Thread.currentThread().getName() + "\t取出数据" + data + "\t成功");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void stop(){
        this.FLAG = false;
    }

}
