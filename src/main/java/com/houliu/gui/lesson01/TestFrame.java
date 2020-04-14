package com.houliu.gui.lesson01;

import java.awt.*;

/**
 * @author houliu
 * @create 2020-04-12 21:56
 *
 * GUI的第一个界面
 */
public class TestFrame {

    public static void main(String[] args) {
        //frame
        Frame frame = new Frame("我的第一个Java图形化界面窗口");
        //需要设置可见行
        frame.setVisible(true);
        //设置窗口大小
        frame.setSize(800,600);
        //设置背景颜色
//        frame.setBackground(Color.blue);
        frame.setBackground(new Color(255, 125, 15));
        //设置弹出的初始位置
        frame.setLocation(200,200);
        //设置大小固定
        frame.setResizable(false);
    }

}
