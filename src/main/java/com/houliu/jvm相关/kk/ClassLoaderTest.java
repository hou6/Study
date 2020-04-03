package com.houliu.jvm相关;

/**
 * @author houliu
 * @create 2020-03-02 20:37
 *
 *          类加载器的层级关系，它们是包含关系，不是继承
 *          （系统类加载器、扩展类加载器、引导类加载器）
 */

public class ClassLoaderTest {

    public static void main(String[] args) {
        //获取系统类加载器(也叫应用类加载器）
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);   //sun.misc.Launcher$AppClassLoader@18b4aac2

        //获取上层，即引导类加载器
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);   //sun.misc.Launcher$ExtClassLoader@5e481248

        //继续获取上层，引导类加载器
        ClassLoader bootstrapClassLoader = extClassLoader.getParent();
        System.out.println(bootstrapClassLoader);  //null，获取不到，因为不是Java语言写的，是C

        //对于用户自定义来说；默认使用系统类加载器进行加载
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();  //获取本类使用的类加载器
        System.out.println(classLoader);    //sun.misc.Launcher$AppClassLoader@18b4aac2

        //String类使用引导类加载器进行加载的  --->  Java的核心类库都是使用引导类加载器进行加载的
        ClassLoader stringClassLoader = String.class.getClassLoader();  //获取不到引导类加载器
        System.out.println(stringClassLoader);  //null
    }

}
