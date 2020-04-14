package com.houliu.gui.lesson01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author houliu
 * @create 2020-04-13 00:01
 */
public class ExDemo {
    public static void main(String[] args) {
        //frame
        Frame frame = new Frame("自由练习");
        frame.setBackground(Color.CYAN);
        frame.setSize(400,400);
        frame.setLocation(300,300);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(2,1));
        //4个面板
        Panel p1 = new Panel(new BorderLayout());
        Panel p2 = new Panel(new GridLayout(2, 1));
        Panel p3 = new Panel(new BorderLayout());
        Panel p4 = new Panel(new GridLayout(2, 2));
        //上面 button,  ok
        p1.add(new Button("p1_West"),BorderLayout.WEST);
        p1.add(new Button("p1_East"),BorderLayout.EAST);
        p2.add(new Button("p2_North"));
        p2.add(new Button("p2_South"));
        p1.add(p2,BorderLayout.CENTER);//把p2添加到p1中
        //下面
        p3.add(new Button("p3_West"),BorderLayout.WEST);
        p3.add(new Button("p3_East"),BorderLayout.EAST);
        for (int i = 1; i <= 4; i++) {
            p4.add(new Button("p4_btn" + i));
        }
        p3.add(p4,BorderLayout.CENTER);  //把p4添加到p3中

        //把p1和p3添加到frame
        frame.add(p1);
        frame.add(p3);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
