package com.houliu.gui.lesson03;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author houliu
 * @create 2020-04-14 14:09
 * //监听鼠标事件
 */
public class TestMouseListener {
    public static void main(String[] args) {
        new MyFrame("画画");
    }
}

class MyFrame extends Frame{
    ArrayList points;
    //画画需要画笔，需要监听鼠标当前的位置，需要集合来存储这个点
    public MyFrame(String title){
        super(title);
        setBounds(200,200,400,300);
        //存鼠标的点
        points = new ArrayList();
        //鼠标监听器,正对鼠标事件
        this.addMouseListener(new MyMouseListener());
        setVisible(true);
    }

    //画笔
    @Override
    public void paint(Graphics g) {
        //画画，监听鼠标的事件
        Iterator iterator = points.iterator();
        while (iterator.hasNext()) {
            Point point = (Point) iterator.next();
            g.setColor(Color.red);
            g.fillOval(point.x,point.y,10,10);
        }
    }

    //添加一个点到界面上
    public void addPoint(Point point){
        points.add(point);
    }

    private class MyMouseListener extends MouseAdapter{

        //鼠标按压事件
        @Override
        public void mousePressed(MouseEvent e) {
            MyFrame myFrame = (MyFrame) e.getSource();
            //这里点击的时候就会在界面上出现一个点,这个点就是鼠标的点;
            myFrame.addPoint(new Point(e.getX(),e.getY()));
            //每次点击鼠标都需要重新花一遍
            myFrame.repaint();//刷新
        }
    }
}
