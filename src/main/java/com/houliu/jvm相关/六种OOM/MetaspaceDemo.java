package com.houliu.jvm相关.六种OOM;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author houliu
 * @create 2020-04-03 23:33
 *
 * 模拟Metaspace空间溢出，不断生成类往元空间灌，类占据的空间总是会超过Metaspace指定的空间大小的
 * 注意：运行前配置 -Xms10m -Xmx10m -XX:MaxMetaspaceSize=10m
 */
public class MetaspaceDemo {

    static class OOMTest{

    }

    public static void main(String[] args) {
        int count = 0;  //计算。模拟计数多少次后发生异常
        while (true) {
            try {
                count++;
                Enhancer enhancer = new Enhancer();
                enhancer.setSuperclass(OOMTest.class);
                enhancer.setUseCache(false);
                enhancer.setCallback(new MethodInterceptor() {
                    @Override
                    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                        return methodProxy.invokeSuper(o,args);
                    }
                });
                enhancer.create();
            }catch (Exception e){
                System.out.println(count + "次后发生了异常。。。。。。");
                e.printStackTrace();
            }
        }
    }

}
