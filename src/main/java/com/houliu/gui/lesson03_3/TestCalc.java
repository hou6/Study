package com.houliu.gui.lesson03_3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author houliu
 * @create 2020-04-14 01:30
 * 对计算器的进一步优化，使用内部类
 */
public class TestCalc {
    public static void main(String[] args) {
        new Calculator().loadFrame();
    }
}

//计算器类
class Calculator extends Frame {

    TextField num1;
    TextField num2;
    TextField num3;

    public void loadFrame(){
        //3个文本框
        num1 = new TextField(10); //字符数，允许输入的最大字符数
        num2 = new TextField(10); //字符数，允许输入的最大字符数
        num3 = new TextField(20); //字符数，允许输入的最大字符数
        //1个按钮
        Button button = new Button("=");
        //给按钮添加事件
        button.addActionListener(new MyCalculatorListener());
        //1个标签
        Label label = new Label("+");

        setLayout(new FlowLayout()); //流式布局
        add(num1);
        add(label);
        add(num2);
        add(button);
        add(num3);

        setBackground(new Color(167, 231, 47));
        pack();
        setVisible(true);
    }

    //事件监听类,使用匿名内部类
    private class MyCalculatorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            //获取加数和被加数
            int n1 = Integer.parseInt(num1.getText());
            int n2 = Integer.parseInt(num2.getText());
            //将这两个值加法运算后，放到第三个框
            num3.setText("" + (n1+n2));
            //清空前两个框
            num1.setText("");
            num2.setText("");
        }
    }
}

