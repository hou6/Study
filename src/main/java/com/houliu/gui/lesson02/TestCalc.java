package com.houliu.gui.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author houliu
 * @create 2020-04-14 00:58
 * 简易计算器
 */
public class TestCalc {
    public static void main(String[] args) {
        new Calculator();
    }
}

//计算器类
class Calculator extends Frame{
    public Calculator(){
        //3个文本框
        TextField num1 = new TextField(10); //字符数，允许输入的最大字符数
        TextField num2 = new TextField(10); //字符数，允许输入的最大字符数
        TextField num3 = new TextField(20); //字符数，允许输入的最大字符数
        //1个按钮
        Button button = new Button("=");
        //给按钮添加事件
        button.addActionListener(new MyCalculatorListener(num1,num2,num3) );
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
}

//事件监听类
class MyCalculatorListener implements ActionListener{

    //获取三个变量
    private TextField num1,num2,num3;

    public MyCalculatorListener(TextField num1,TextField num2,TextField num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //获取加数和被加数
        int n1 = Integer.parseInt(this.num1.getText());
        int n2 = Integer.parseInt(this.num2.getText());
        //将这两个值加法运算后，放到第三个框
        num3.setText("" + (n1+n2));
        //清空前两个框
        num1.setText("");
        num2.setText("");
    }
}
