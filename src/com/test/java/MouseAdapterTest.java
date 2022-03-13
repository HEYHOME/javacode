package com.test.java;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author hey
 * @description
 * @create 2020-06-13-16:59
 */
public class MouseAdapterTest {
    JFrame f;
    JButton b;
    MouseAdapterTest(){
        f = new JFrame("鼠标适配器测试");
        b = new JButton("按我");
        b.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                b.setText("我被Mouse按下了");
            }
        });
        f.add(b);
        f.setSize(200,100);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new MouseAdapterTest();
    }
}
