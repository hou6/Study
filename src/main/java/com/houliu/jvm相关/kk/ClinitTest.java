package com.houliu.jvm相关;

/**
 * @author houliu
 * @create 2020-03-02 17:24
 */

/**
 *     若该类具有父类，JVM 会保证子类的 <clinit>() 执行前，父类的  <clinit>()  已经执行完毕
 */
public class ClinitTest {

    static class Father{
        public static int A = 1;
        static {
            A = 2;
        }
    }

    static class Son extends Father{
        public static int B = A;
    }

    public static void main(String[] args) {
        //会先加载Father类，再加载Son类，没有 静态代码块 或 静态变量 ，就不会生成 <clinit>() 方法
        System.out.println(Son.B);//2
    }

}
