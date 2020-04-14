package com.houliu.gui.lesson01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author houliu
 * @create 2020-04-12 22:31
 *   panel:可以看成一个空间，但是不能单独存在
 */
public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame("panel的demo"); //窗口
        //布局的概念
        Panel panel = new Panel(); //面板
        //设置布局
        frame.setLayout(null);
        //窗口坐标
        frame.setBounds(300,300,500,500);
        frame.setBackground(new Color(74, 249, 29));
        //面板的坐标,相对于frame
        panel.setBounds(50,50,400,400);
        panel.setBackground(new Color(249, 134, 44));
        //把面板放进窗口
        frame.add(panel);
        //设置窗口可见行
        frame.setVisible(true);
        //监听事件，监听窗口关闭事件   System.exit(0);
        //适配器模式
        frame.addWindowListener(new WindowAdapter() {
            //窗口点击关闭的时候需要做的事
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
