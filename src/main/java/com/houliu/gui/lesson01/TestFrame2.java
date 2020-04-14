package com.houliu.gui.lesson01;

import java.awt.*;

/**
 * @author houliu
 * @create 2020-04-12 22:14
 */
public class TestFrame2 {

    public static void main(String[] args) {
        //展示多个窗口
        MyFrame myFrame1 = new MyFrame(100, 100, 200, 200, Color.blue);
        MyFrame myFrame2 = new MyFrame(300, 100, 200, 200, Color.yellow);
        MyFrame myFrame3 = new MyFrame(100, 300, 200, 200, Color.red);
        MyFrame myFrame4 = new MyFrame(300, 300, 200, 200, Color.green);
    }

}

class MyFrame extends Frame{
    static int id = 0;//可能存在多个窗口，需要一个计数器

    public MyFrame(int x,int y,int w,int h,Color color) throws HeadlessException {
        super("MyFrame -->" + (++id));
        setBackground(color); //设置颜色
        setBounds(x,y,w,h); //设置窗口坐标和宽高
        setVisible(true);  //设置可见性
    }
}
