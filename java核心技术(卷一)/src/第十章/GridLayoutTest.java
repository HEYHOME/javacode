package 第十章;

import javax.swing.*;
import java.awt.*;

/**
 * @author hey
 * @description
 * @create 2020-05-29-17:47
 */
public class GridLayoutTest {
    JFrame f = new JFrame("网络布局测试");
    Container cp = f.getContentPane();
    JPanel jp = new JPanel(new GridLayout(4, 4, 3, 3));
    JTextArea ta = new JTextArea();
    String[] str = {"1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "*", "0", ".", "=", "/"};
    GridLayoutTest(){
        JButton[] btn;
        btn = new JButton[str.length];
        for (int i = 0; i < str.length; i++) {
            btn[i] = new JButton(str[i]);
            jp.add(btn[i]);
        }
        cp.add(ta,BorderLayout.NORTH);
        cp.add(jp,BorderLayout.CENTER);
        f.setSize(250,200);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new GridLayoutTest();
    }
}
