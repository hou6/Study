package com.houliu.gui.lesson01;

import java.awt.*;

/**
 * @author houliu
 * @create 2020-04-12 22:58
 *
 * 流式布局
 */
public class TestFolwLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();

        //设置按钮
        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");

        //设置流式布局
//        frame.setLayout(new FlowLayout());//默认居中
//        frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.setLayout(new FlowLayout(FlowLayout.RIGHT));
        //设置坐标和宽高
        frame.setBounds(300,300,500,550);
        //把按钮添加上去
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        //设置窗口可见
        frame.setVisible(true);
    }
}
