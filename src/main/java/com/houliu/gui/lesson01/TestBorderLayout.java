package com.houliu.gui.lesson01;

import java.awt.*;

/**
 * @author houliu
 * @create 2020-04-12 23:12
 *  东西南北中布局
 */
public class TestBorderLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("东西南北中布局");

        Button south = new Button("South");
        Button west = new Button("West");
        Button north = new Button("North");
        Button east = new Button("East");
        Button center = new Button("Center");

        frame.add(south,BorderLayout.SOUTH);
        frame.add(west,BorderLayout.WEST);
        frame.add(north,BorderLayout.NORTH);
        frame.add(east,BorderLayout.EAST);
        frame.add(center,BorderLayout.CENTER);

        frame.setBounds(200,200,500,550);
        frame.setVisible(true);

    }
}
