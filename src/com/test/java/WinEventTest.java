package com.test.java;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * @author hey
 * @description
 * @create 2020-06-13-17:08
 */
public class WinEventTest {
    JFrame f;
    JLabel l;
    WinEventTest(){
        f = new JFrame("WindowEvent测试");
        l = new JLabel("显示当前窗口的状态",JLabel.CENTER);
        f.add("Center",l);
        WinEvent inClass = new WinEvent();
        f.addWindowListener(inClass);
        f.setSize(300,200);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
    }
    public class WinEvent implements WindowListener{

        @Override
        public void windowOpened(WindowEvent e) {
            l.setText("窗口当前状态:windowOpened");
        }

        public void windowClosing(WindowEvent event) {
            System.out.println("窗口当前状态:windowClosing");
            System.exit(0);
        }

        public void windowClosed(WindowEvent event) {
            System.out.println("窗口当前状态:windowClosed");
        }

        @Override
        public void windowIconified(WindowEvent e) {
            System.out.println("窗口当前状态:windowIconified");
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            System.out.println("窗口当前状态:windowDeiconified");
        }

        @Override
        public void windowActivated(WindowEvent e) {
            l.setText("窗口当前状态:windowActivated");
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            l.setText("窗口当前状态:windowDeactivated");
        }
    }

    public static void main(String[] args) {
        new WinEventTest();
    }
}
