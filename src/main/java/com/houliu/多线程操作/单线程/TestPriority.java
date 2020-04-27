package com.houliu.多线程操作.单线程;

/**
 * @author houliu
 * @create 2020-04-26 22:31
 *      线程的优先级，数字表示，范围从1-10,一般情况下，数字越大，优先级越高，但并不是绝对的
 *          Thread.MIN_PRIORITY = 1;
 *          Thread.MAX_PRIORITY = 1;
 *          Thread.NORM_PRIORITY = 1;
 *
 *      设置线程优先级: setPriority(int xxx);
 *      获取线程优先级: getPriority();
 *
 *
 */
public class TestPriority {
    public static void main(String[] args) {
        MyPriority myPriority = new MyPriority();
        Thread t1 = new Thread(myPriority,"t1");
        Thread t2 = new Thread(myPriority,"t2");
        Thread t3 = new Thread(myPriority,"t3");
        Thread t4 = new Thread(myPriority,"t4");
        Thread t5 = new Thread(myPriority,"t5");
        Thread t6 = new Thread(myPriority,"t6");

        t1.start();

        t2.setPriority(Thread.MIN_PRIORITY);  //最低优先级
        t2.start();

        t3.setPriority(Thread.NORM_PRIORITY);  //5,默认优先级
        t3.start();

        t5.setPriority(-1);  //会报错
        t5.start();

        t4.setPriority(Thread.MAX_PRIORITY);  //最大优先级
        t4.start();


        t6.setPriority(11);  //会报错
        t6.start();
    }
}

class MyPriority implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "--->" + Thread.currentThread().getPriority());
    }
}
