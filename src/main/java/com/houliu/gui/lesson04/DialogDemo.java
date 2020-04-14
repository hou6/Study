package com.houliu.gui.lesson04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author houliu
 * @create 2020-04-14 16:43
 * 弹窗
 */

//主窗口
public class DialogDemo extends JFrame {
    public static void main(String[] args) {
        new DialogDemo();
    }

    public DialogDemo(){
        this.setVisible(true);
        this.setSize(500,400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //JFrame，放东西，容器
        Container container = this.getContentPane();
        //绝对布局
        container.setLayout(null);
        //按钮
        JButton button = new JButton("点击弹出一个对话框");
        button.setBounds(30,30,200,50);
        //点击这个按钮的时候弹出一个弹窗
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //弹窗
                new MyDialogDemo();
            }
        });

        container.add(button);
    }
}

class MyDialogDemo extends JDialog{
    public MyDialogDemo(){
        setVisible(true);
        setBounds(100,100,500,500);
//        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  弹窗默认自带可点击关闭，不用多余写

        Container container = this.getContentPane();
        container.setLayout(null);
        container.add(new Label("猴六学Java"));
    }
}
