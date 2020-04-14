package com.houliu.jvm相关.kk;

/**
 * @author houliu
 * @create 2020-03-08 00:22
 *
 *          测试对栈帧的压栈和出栈   -----》 先进后出
 *
 */
public class StackFrameTest {

    public static void main(String[] args) {
        StackFrameTest stackFrameTest = new StackFrameTest();
        stackFrameTest.method1();
    }

    public void method1(){
        System.out.println("method1() 开始执行....");
        method2();
        System.out.println("method1() 执行结束......");
//        return;  //无返回值的方法也可以写return，这个return可以省略
    }

    private int method2() {
        System.out.println("method2() 开始执行....");
        int i = 10;
        int m = (int) method3();
        System.out.println("method2() 即将结束......");
        return i + m;
    }

    private double method3() {
        System.out.println("method3() 开始执行....");
        double j = 20.0;
        System.out.println("method3() 即将结束....");
        return j;
    }

}
