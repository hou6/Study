package com.houliu.gui.lesson04;

import javax.swing.*;
import java.awt.*;

/**
 * @author houliu
 * @create 2020-04-14 17:54
 * 图标,需要实现接口,继承frame
 */
public class IconDemo extends JFrame implements Icon {

    private int width;
    private int height;

    public IconDemo() {
    }

    public IconDemo(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {
        new IconDemo().init();
    }

    public void init(){
        IconDemo iconDemo = new IconDemo(15, 15);
        //图标可以放在标签上，也可以放在按钮上
        JLabel label = new JLabel("IconTest", iconDemo, SwingConstants.CENTER);

        Container container = this.getContentPane();
        container.add(label);
        this.setBounds(100,100,500,400);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.fillOval(x,y,width,height); //画圆
    }

    @Override
    public int getIconWidth() {
        return this.width;
    }

    @Override
    public int getIconHeight() {
        return this.height;
    }
}
