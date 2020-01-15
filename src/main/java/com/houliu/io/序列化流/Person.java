package com.houliu.io.序列化流;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author houliu
 * @create 2020-01-15 12:56
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Serializable {

    /*
        static：关键字
            静态优先于非静态加载到内存中
            被static修饰的变量不能被序列化
        transient: 关键字
            被transient修饰的成员变量，不能被序列化
     */

    private static final Long serialVersionUIDAdder = 1L;

    private String name;
    private /*transient*/ int age;

}
