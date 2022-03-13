package 第十章;

import javax.swing.*;
import java.awt.*;

/**
 * @author hey
 * @description
 * @create 2020-05-29-16:37
 */
public class JScrollPaneTest {
    JScrollPane sp;
    public JScrollPaneTest(){
        JFrame frame = new JFrame("滚动面板JScrollPane测试");
        Container container = frame.getContentPane();
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(1,1));
        jPanel.setBorder(BorderFactory.createTitledBorder("WEGAME图"));
        sp = new JScrollPane(jPanel);
        container.add(sp,BorderLayout.CENTER);
        JLabel label = new JLabel(new ImageIcon("C:\\Users\\lenovo\\Desktop\\icon.png"));
        jPanel.add(label);
        frame.setSize(new Dimension(400,300));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JScrollPaneTest();
    }
}
