package com.houliu.gui.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author houliu
 * @create 2020-04-14 00:03
 *
 * 多个按钮公用事件
 */
public class TestActionTwo {
    public static void main(String[] args) {
        Frame frame = new Frame("开始-停止");
        Button button1 = new Button("start");
        Button button2 = new Button("stop");

        //可以显示的定义触发会返回的命令，如果不显示定义，则会走默认的值
        //可以多个按钮只写一个事件
        button1.setActionCommand("btn1-start");  //设置按钮的信息
        button2.setActionCommand("btn2-stop");

        MyMonitor myMonitor = new MyMonitor();
        button1.addActionListener(myMonitor); //给按钮添加事件
        button2.addActionListener(myMonitor);

        frame.add(button1,BorderLayout.NORTH);
        frame.add(button2,BorderLayout.SOUTH);
        frame.pack();
        frame.setBounds(200,200,300,300);
        frame.setBackground(Color.CYAN);
        frame.setVisible(true);
    }
}

class MyMonitor implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand()+"\t按钮被点击了"); //获取按钮的信息
    }
}
