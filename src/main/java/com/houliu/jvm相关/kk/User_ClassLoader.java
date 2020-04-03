package com.houliu.jvm相关;

import java.io.FileNotFoundException;

/**
 * @author houliu
 * @create 2020-03-03 00:37
 */
public class User_ClassLoader extends ClassLoader {

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        try {
            byte[] result = getClassFromCustomPath(name);
            if (result == null){
                throw new FileNotFoundException("文件找不到");
            }else {
                return defineClass(name,result,0,result.length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        throw new ClassNotFoundException(name);
    }

    private byte[] getClassFromCustomPath(String name){
        //自定义路径中加载指定类，细节略
        //如果指定路径的字节码文件进行了加密，则需要在此方法中进行解密
        return null;
    }

    public static void main(String[] args) {
        User_ClassLoader classLoader = new User_ClassLoader();
        try {
            Class<?> clazz = Class.forName("One", true, classLoader);
            Object obj = clazz.newInstance();
            System.out.println(obj.getClass().getClassLoader());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
