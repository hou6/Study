package com.houliu.gui.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author houliu
 * @create 2020-04-13 23:38
 * 监听事件
 */
public class TestActionEvent {
    public static void main(String[] args) {
        //按下按钮，触发一些事件
        Frame frame = new Frame("按钮点击事件");
        Button button = new Button("我是btn");
        MyActionListener myActionListener = new MyActionListener();
        button.addActionListener(myActionListener);
        frame.add(button);
        frame.pack();
        frame.setBounds(200,200,300,300);
        frame.setBackground(Color.CYAN);
        windowClose(frame);//关闭窗口
        frame.setVisible(true);
    }

    //关闭窗口的方法
    private static void windowClose(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

//事件监听类
class MyActionListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("houliu");
    }
}
