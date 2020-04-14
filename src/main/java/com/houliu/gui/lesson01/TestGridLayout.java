package com.houliu.gui.lesson01;

import java.awt.*;

/**
 * @author houliu
 * @create 2020-04-12 23:27
 *
 * 表格布局
 */
public class TestGridLayout {

    public static void main(String[] args) {
        Frame frame = new Frame("表格布局");
        frame.setBounds(300,200,500,500);

        Button btn1 = new Button("btn1");
        Button btn2 = new Button("btn2");
        Button btn3 = new Button("btn3");
        Button btn4 = new Button("btn4");
        Button btn5 = new Button("btn5");
        Button btn6 = new Button("btn6");

        frame.setLayout(new GridLayout(3,2));  //3行2列
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);
        frame.add(btn6);

        frame.setBackground(Color.blue);
        frame.pack(); //Java函数
        frame.setVisible(true);
    }

}
