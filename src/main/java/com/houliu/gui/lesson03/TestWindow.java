package com.houliu.gui.lesson03;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author houliu
 * @create 2020-04-14 14:40
 * 窗口监听
 */
public class TestWindow {
    public static void main(String[] args) {
        new WindowFrame();
    }
}

class WindowFrame extends Frame{
    public WindowFrame(){
        setBackground(Color.BLUE);
        setBounds(200,200,500,400);
        setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("你点击了X");
                System.exit(0);
            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("windowActivated");
            }
        });
    }
}
