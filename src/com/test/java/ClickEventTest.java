package com.test.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author hey
 * @description
 * @create 2020-06-13-16:44
 */
public class ClickEventTest {
    JFrame f;
    JButton btn;

    ClickEventTest() {
        f = new JFrame("动作事件测试");
        Container cp = f.getContentPane();
        btn = new JButton("单击我呀");
        cp.add("Center",btn);
        Buttonlistener listen = new Buttonlistener();
        btn.addActionListener(listen);
        f.setSize(200,100);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ClickEventTest();
    }
}

class Buttonlistener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton)e.getSource();
        source.setText("我被单击了");
    }
}