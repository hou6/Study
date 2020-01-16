package com.houliu.多线程操作.CAS;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author houliu
 * @create 2020-01-17 01:42
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
class Person {
    String name;
    int age;
}

public class AtomicReferenceDemo {
    public static void main(String[] args) {
        Person zhangsan = new Person("zhangsan", 23);
        Person lisi = new Person("lisi", 24);
        AtomicReference<Person> atomicReference = new AtomicReference<>();   //默认值为null
        System.out.println(atomicReference.compareAndSet(null, zhangsan));
        System.out.println(atomicReference.compareAndSet(zhangsan, lisi));

        System.out.println(atomicReference.get());  //获取AtomicReference原子引用里的值
        System.out.println(atomicReference.get().getName());
        System.out.println(atomicReference.get().getAge());
    }
}
