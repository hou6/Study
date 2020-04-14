package com.houliu.gui.lesson03;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * @author houliu
 * @create 2020-04-14 14:58
 */
public class TestKey {
    public static void main(String[] args) {
        new MyKeyFrame();
    }
}

class MyKeyFrame extends Frame{
    public MyKeyFrame(){
        setBounds(1,2,300,250);
        setVisible(true);
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                System.out.println(keyCode);
                if (keyCode == KeyEvent.VK_UP){
                    System.out.println("你按了向上键");
                }
            }
        });
    }
}
