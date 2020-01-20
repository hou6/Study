package com.houliu.java8;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

/**
 * @author houliu
 * @create 2020-01-21 00:03
 */

/**
 *  防空
 */
public class TestOptions {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(str);
        str = null;
        System.out.println(Optional.ofNullable(str).orElse("efgh"));

        //list
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 55, 66);
        list.forEach(System.out::println);
        list = null;
        Optional.ofNullable(list).orElse(Collections.emptyList()).forEach(System.out::println);

        //map
        Map<String, String> map = new HashMap<>();
        Optional.ofNullable(map).orElse(Collections.emptyMap()).forEach((k,v) -> System.out.println(k + ":" + v));

        //对象
        Student student = new Student("houliu", 23);
        Optional<Student> optionalStudent = Optional.ofNullable(student);
        if (optionalStudent.isPresent()) {
            System.out.println(optionalStudent.get());
        }
    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class Student{
    String name;
    int age;
}
