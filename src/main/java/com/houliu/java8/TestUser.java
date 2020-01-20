package com.houliu.java8;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @author houliu
 * @create 2020-01-20 16:52
 */
public class TestUser {

    @Test
    public void test1(){
        User zhangsan = new User(1, "zhangsan", 23);
        User lisi = new User(2, "lisi", 24);
        User wangwu = new User(3, "wangwu", 25);
        List<User> userList = Arrays.asList(zhangsan, lisi, wangwu);
        userList.forEach(System.out::println);
        //把用户名通过特定的分隔符拼接成字符串
        System.out.println(userList.stream().map(User::getName).collect(Collectors.joining("-")));
        //把姓名归类为一个集合
        List<String> nameList = userList.stream().map(User::getName).collect(Collectors.toList());
        nameList.forEach(System.out::println);
        //取出最大的年纪
        int maxAge = userList.stream().map(User::getAge).max(Integer::compareTo).get();
        int maxAge2 = userList.stream().mapToInt(User::getAge).max().getAsInt();
        System.out.println(maxAge);
        System.out.println(maxAge == maxAge2);
        //取出最大的年纪的用户
        User user = userList.stream().max(Comparator.comparing(User::getAge)).get();
        System.out.println(user);
        //通过姓名分组
        Map<Integer, List<User>> groupByAge = userList.stream().collect(Collectors.groupingBy(User::getAge));
        groupByAge.forEach((k,v) -> System.out.println(k + ":" + v));
        //计算出平均年龄
        double avgAge = userList.stream().mapToDouble(User::getAge).average().getAsDouble();
        System.out.println(avgAge);
        //过滤掉名字大于四个字符的
        userList.stream().filter(u -> u.getName().length() <= 4).forEach(System.out::println);
        //判断有没有年龄大于26岁的
        if (userList.stream().noneMatch(u -> u.getAge() > 26)) {
            System.out.println("没有年龄大于26岁的");
        }
        if (userList.stream().allMatch(u -> u.getAge() >= 18)) {
            System.out.println("没有未成年人");
        }
        if (userList.stream().anyMatch(u -> u.getAge() > 24)) {
            System.out.println("有年龄大于24岁的");
        }
        //通过年龄降序排列
        List<User> userList1 = userList.stream().sorted(Comparator.comparing(User::getAge).reversed()).collect(Collectors.toList());
        userList1.forEach(System.out::println);
    }

    @Test
    public void test2(){
        //计算1-100的和
        System.out.println(Stream.iterate(1, i -> i + 1).limit(100).reduce(Integer::sum).get());
        System.out.println(LongStream.rangeClosed(0L, 100L).parallel().sum());
        //生成10个100以内的随机整数
        Stream.generate(() -> (int)(Math.random() * 1000)).limit(10).forEach(System.out::println);
        //生成5个UUID
        Stream.generate(() -> UUID.randomUUID().toString().substring(3,8)).limit(5).forEach(System.out::println);
        //打印从今天开始5天的日期
        Stream.iterate(LocalDateTime.now(),today -> today.plusDays(1)).limit(5).forEach(System.out::println);
        //打印5个helloWorld
        Stream.generate(() -> "helloWorld").limit(3).forEach(System.out::println);
    }

    @Test
    public void test3(){
        //字符串java复制5遍
        System.out.println(StringUtils.repeat("Java", 5));
        //统计JavaghueipahJavagudjphgiujJavapkahiujghjpahugJavaijdhpuagihduaiJavagdujakpgvdjikghJavaafudijaghfuhdji字符串里有多少个Java
        System.out.println(StringUtils.countMatches("JavaghueipahJavagudjphgiujJavapkahiujghjpahugJavaijdhpuagihduaiJavagdujakpgvdjikghJavaafudijaghfuhdji", "Java"));
        //把集合通过特定的分隔符变为字符串
        System.out.println(StringUtils.join(Arrays.asList("zhangsan", "lisi", "wangwu", "houliu"), "-"));
    }

}
