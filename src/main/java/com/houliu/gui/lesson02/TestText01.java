package com.houliu.gui.lesson02;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author houliu
 * @create 2020-04-14 00:16
 * 文本框事件
 */
public class TestText01 {
    public static void main(String[] args) {
        new MyFrame();
    }

}

class MyFrame extends Frame{
    public MyFrame(){
        TextField textField = new TextField();
        add(textField);
        //监听这个文本框输入的文字
        MyActionListener2 myActionListener2 = new MyActionListener2();
        //按下enter就会触发这个输入框的事件
        textField.addActionListener(myActionListener2);
        //设置替换编码
        textField.setEchoChar('*');

        pack();
        setBounds(200,200,300,300);
        setVisible(true);
    }
}

class MyActionListener2 implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        TextField TextField = (TextField)e.getSource();  //获得一些资源，得到的是一个对象
        System.out.println(TextField.getText());  //获得输入框的文本
        TextField.setText(""); //回车后文本框设置为空
    }
}



