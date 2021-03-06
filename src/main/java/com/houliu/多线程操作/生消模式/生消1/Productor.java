package com.houliu.多线程操作.生消模式.生消1;

import java.util.concurrent.TimeUnit;

/**
 * @author houliu
 * @create 2020-01-16 22:38
 */

//生产者
public class Productor implements Runnable {

    private Clerk clerk;

    public Productor(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                TimeUnit.SECONDS.sleep(1L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.get();   //店里进货
        }
    }
}
