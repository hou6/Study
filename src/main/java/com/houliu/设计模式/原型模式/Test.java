package com.houliu.设计模式.原型模式;

import java.util.Date;

/**
 * @author houliu
 * @create 2020-01-18 17:38
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date();
        Video video = new Video("猴六说Java", date);
        System.out.println(video);

        date.setTime(123456534L);
        Video video1 = (Video) video.clone();
        System.out.println(video1);
    }
}
