package 第十章;

import javax.swing.*;
import java.awt.*;

/**
 * @author hey
 * @description
 * @create 2020-06-05-20:58
 */
public class NullLayoutTest {
    JFrame jf = new JFrame("null布局测试");
    JLabel lName = new JLabel("用户名称:");
    JTextField tName = new JTextField();
    JLabel lPassword = new JLabel("用户密码:");
    JPasswordField tPassword = new JPasswordField();
    JButton Login = new JButton("登录");
    JButton Reset = new JButton("重设");
    NullLayoutTest(){
        Container cp = jf.getContentPane();
        jf.setLayout(null);
        lName.setBounds(new Rectangle(45,38,67,34));
        tName.setBounds(new Rectangle(115,39,210,33));
        lPassword.setBounds(new Rectangle(43,86,66,26));
        tPassword.setBounds(new Rectangle(115,84,210,33));
        Login.setBounds(new Rectangle(78,150,86,30));
        Reset.setBounds(new Rectangle(193,150,86,30));
        cp.add(lName);
        cp.add(tName);
        cp.add(lPassword);
        cp.add(tPassword);
        cp.add(Login);
        cp.add(Reset);
        jf.setSize(390,250);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new NullLayoutTest();
    }
}
