package 第十章;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author hey
 * @description
 * @create 2020-05-29-17:21
 */
public class CardLayoutTest implements ActionListener {
    CardLayout card = new CardLayout();
    JFrame f;
    JPanel cardPanel;
    JPanel controlPanel;
    JButton first,last,next,previous;
    CardLayoutTest(){
        f = new JFrame("卡片布局测试");
        cardPanel = new JPanel();
        cardPanel.setLayout(card);
        controlPanel = new JPanel();
        Container cp = f.getContentPane();
        cp.add(cardPanel,BorderLayout.CENTER);
        cp.add(cardPanel,BorderLayout.SOUTH);
        JLabel l1 = new JLabel(new ImageIcon("C:\\Users\\lenovo\\Desktop\\icon.png"));
        JLabel l2 = new JLabel(new ImageIcon("C:\\Users\\lenovo\\Desktop\\icon2.png"));
        JLabel l3 = new JLabel(new ImageIcon("C:\\Users\\lenovo\\Desktop\\icon3.png"));
        cardPanel.add("l1",l1);
        cardPanel.add("l2",l2);
        cardPanel.add("l3",l3);
        first =new JButton("第一张");
        next = new JButton("下一张");
        previous = new JButton("上一张");
        last = new JButton("最末张");
        controlPanel.add(first);
        controlPanel.add(next);
        controlPanel.add(previous);
        controlPanel.add(last);
        first.addActionListener(this);
        next.addActionListener(this);
        previous.addActionListener(this);
        last.addActionListener(this);
        f.setSize(400,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent arg0){
        String command = arg0.getActionCommand();
        if (command.equals("第一张"))card.first(cardPanel);
        if (command.equals("下一张"))card.next(cardPanel);
        if (command.equals("上一张"))card.previous(cardPanel);
        if (command.equals("最末张"))card.last(cardPanel);
    }

    public static void main(String[] args) {
        new CardLayoutTest();
    }
}
