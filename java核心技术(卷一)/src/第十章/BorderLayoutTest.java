package 第十章;

import javax.swing.*;
import java.awt.*;

/**
 * @author hey
 * @description
 * @create 2020-05-29-17:13
 */
public class BorderLayoutTest {
    JFrame f = null;
    BorderLayout l;
    public BorderLayoutTest(){
        f = new JFrame("BorderLayout测试");
        Container cp = f.getContentPane();
        l = new BorderLayout(5,5);
        f.setLayout(l);
        cp.add("East", new JButton("东"));
        cp.add("North", new JButton("北"));
        cp.add("West", new JButton("西"));
        cp.add("South", new JButton("南"));
        cp.add("Center", new JButton("中"));
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new BorderLayoutTest();
    }
}
