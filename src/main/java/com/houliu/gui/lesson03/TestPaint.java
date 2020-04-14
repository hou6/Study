package com.houliu.gui.lesson03;

import java.awt.*;

/**
 * @author houliu
 * @create 2020-04-14 13:20
 * 画笔
 */
public class TestPaint {
    public static void main(String[] args) {
        new MyPaint().loadFrame();
    }
}

class MyPaint extends Frame{
    public void loadFrame(){
        setBounds(200,200,600,500);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        //super.paint(g);
        //画笔，需要有颜色，要话的图形
        g.setColor(Color.green);
//        g.drawOval(100,100,300,300); //空心圆
        g.fillOval(100,100,100,100); //实心圆
        g.setColor(Color.red);
        g.fillRect(150,200,100,100);
        //养成习惯，画笔用完，将画笔还原到最初的颜色,黑色
    }
}
