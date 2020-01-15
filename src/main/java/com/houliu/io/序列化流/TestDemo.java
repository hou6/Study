package com.houliu.io.序列化流;

import java.io.*;
import java.util.ArrayList;

/**
 * @author houliu
 * @create 2020-01-15 13:53
 */
public class TestDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("张三",18));
        list.add(new Person("李四",19));
        list.add(new Person("王武",20));
        //序列化写
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/houliu/IdeaProjects/Study/src/main/java/com/houliu/io/序列化流/list.txt"));
        oos.writeObject(list);
        //反序列化读
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/houliu/IdeaProjects/Study/src/main/java/com/houliu/io/序列化流/list.txt"));
        Object o = ois.readObject();
        ArrayList<Person> list1 = (ArrayList<Person>) o;
        list1.forEach(System.out::println);
        //关闭资源
        oos.close();
        ois.close();
    }
}
