package 第十章;

import javax.swing.*;
import java.awt.*;

/**
 * @author hey
 * @description
 * @create 2020-05-29-17:06
 */
public class FlowLayoutTest {
    JFrame f;
    public FlowLayoutTest(){
        f = new JFrame("FlowLayout测试");
        FlowLayout fl = new FlowLayout(FlowLayout.RIGHT,10,10);
        f.setLayout(fl);
        f.add(new JButton("短按钮"));
        f.add(new JButton("中间长度按钮"));
        f.add(new JButton("比较长一点的按钮"));
        f.add(new JButton("四个按钮中最长的一个按钮"));
        f.setSize(300,200);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new FlowLayoutTest();
    }
}
