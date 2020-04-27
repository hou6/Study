package com.houliu.多线程操作.单线程;

/**
 * @author houliu
 * @create 2020-04-27 00:18
 *      多个窗口买票问题，老是忘记，记住了在这里
 */
public class TicketDemo {
    public static void main(String[] args) {
        ticketWindow ticketWindow = new ticketWindow();
        Thread t1 = new Thread(ticketWindow, "t1");
        Thread t2 = new Thread(ticketWindow, "t2");
        Thread t3 = new Thread(ticketWindow, "t3");

        t1.start();
        t2.start();
        t3.start();

    }
}

class ticketWindow implements Runnable{

    private static int ticketNum = 100;

    @Override
    public void run() {
        try {
            while (true){
                synchronized (ticketWindow.class){
                    if (ticketNum > 0){
                        System.out.println(Thread.currentThread().getName() + "已经卖出第" + (ticketNum--) + "张票");
                        Thread.sleep(1L);
                    }else {
                        break;
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
