package com.houliu.gui.lesson04;

import javax.swing.*;
import java.awt.*;

/**
 * @author houliu
 * @create 2020-04-14 15:34
 */
public class JFrameDemo {
    public static void main(String[] args) {
        new MyJFrame().init();
    }
}

class MyJFrame extends JFrame{
    //初始化
    public void init(){
        //顶级窗口
        setBounds(100,100,400,300);
        setVisible(true);

        JLabel jLabel = new JLabel("欢迎来到猴六学GUI");
        this.add(jLabel);
        //让文本标签居中
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);

        Container container = this.getContentPane();
        container.setBackground(Color.yellow);

//        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}