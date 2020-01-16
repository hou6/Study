package com.houliu.多线程操作.CAS;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * @author houliu
 * @create 2020-01-17 01:51
 */
public class AtomicStampedReferenceDemo {
    static AtomicStampedReference<Integer> atomicStampedReference = new AtomicStampedReference<>(100, 1);

    public static void main(String[] args) {
        new Thread(() -> {
            try { TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) { e.printStackTrace(); }
            int stamp = atomicStampedReference.getStamp();
            System.out.println(Thread.currentThread().getName() + "\t第一次版本号为:" + stamp);
            atomicStampedReference.compareAndSet(100,101,
                    atomicStampedReference.getStamp(),atomicStampedReference.getStamp() + 1);
            System.out.println(Thread.currentThread().getName() + "\t第二次版本号为:" + atomicStampedReference.getStamp());
            atomicStampedReference.compareAndSet(101,100,
                    atomicStampedReference.getStamp(),atomicStampedReference.getStamp() + 1);
            System.out.println(Thread.currentThread().getName() + "\t第三次版本号为:" + atomicStampedReference.getStamp());
        },"AAA").start();

        new Thread(() -> {
            int stamp = atomicStampedReference.getStamp();
            System.out.println(Thread.currentThread().getName() + "\t第一次版本号为:" + stamp);
            try { TimeUnit.SECONDS.sleep(3); } catch (InterruptedException e) { e.printStackTrace(); }
            System.out.println(
                    "修改成功否:\t" + atomicStampedReference.compareAndSet(100, 101, stamp, stamp + 1)
                            + "\t当前值为:" + atomicStampedReference.getReference()
                            + "\t当前版本号为:" + atomicStampedReference.getStamp()
            );
        },"BBB").start();
    }
}
