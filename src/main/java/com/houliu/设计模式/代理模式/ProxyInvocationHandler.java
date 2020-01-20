package com.houliu.设计模式.代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author houliu
 * @create 2020-01-18 17:04
 */

/**
 * 这里的代码可当作工具类
 */
public class ProxyInvocationHandler implements InvocationHandler {

    private Object object;

    public void setObject(Object object) {
        this.object = object;
    }

    //获取需要代理的接口
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),object.getClass().getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        look();
        hetong();
        return method.invoke(object, args);
    }



    //可以根据自家的业务需要添加相应的方法
    public void look(){
        System.out.println("中介带客看房。。。");
    }
    public void hetong(){
        System.out.println("中介带签合同。。。。");
    }
}
