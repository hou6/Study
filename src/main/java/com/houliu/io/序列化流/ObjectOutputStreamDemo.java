package com.houliu.io.序列化流;

import java.io.*;

/**
 * @author houliu
 * @create 2020-01-15 13:04
 */
public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //序列化流去写person
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/houliu/IdeaProjects/Study/src/main/java/com/houliu/io/序列化流/person.txt"));
        oos.writeObject(new Person("小美女",18));
        //反序列化流去读person
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/Users/houliu/IdeaProjects/Study/src/main/java/com/houliu/io/序列化流/person.txt"));
        Person person = (Person) ois.readObject();
        System.out.println(person);
        System.out.println(person.getName() + ":" +  person.getAge());
        //释放资源
        ois.close();
        oos.close();
    }
}
