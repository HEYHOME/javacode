package 第十章;

import javax.swing.*;
import java.awt.*;

/**
 * @author hey
 * @description
 * @create 2020-05-29-16:52
 */
public class JTabbedPaneTest {
    public static void main(String[] angs) {
        JFrame jf = new JFrame("JTabbedPane测试");
        JTabbedPane tp = new JTabbedPane();
        jf.setContentPane(tp);
        JPanel jPanel = new JPanel();
        tp.addTab("Tab1",jPanel);
        tp.setEnabledAt(0,true);
        tp.setTitleAt(0,"学校");
        JLabel jLabel = new JLabel("韶关学院");
        jPanel.add(jLabel);
        JPanel jPanel1 = new JPanel();
        tp.addTab("Tab2",jPanel1);
        tp.setEnabledAt(1,true);
        tp.setTitleAt(1,"专业");
        JLabel jLabel1 = new JLabel("软件工程");
        jPanel1.add(jLabel1);
        tp.setPreferredSize(new Dimension(200,100));
        tp.setTabPlacement(JTabbedPane.TOP);
        tp.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.setSize(new Dimension(200,100));
    }
}
