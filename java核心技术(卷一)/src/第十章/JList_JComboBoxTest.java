package 第十章;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * @author hey
 * @description
 * @create 2020-06-05-21:15
 */
public class JList_JComboBoxTest implements ItemListener, ListSelectionListener {
    JList<String> list;
    JComboBox<String> comboBox;
    JTextArea ta;
    JList_JComboBoxTest(){
        JFrame jFrame = new JFrame("列表框与组合框测试");
        String[] item = {"中山大学", "华南理工", "暨南大学", "韶关学院"};
        list = new JList<>(item);
        list.setBorder(BorderFactory.createTitledBorder("请选择学校:"));
        list.setSelectedIndex(1);
        list.addListSelectionListener(this);
        comboBox=  new JComboBox<>();
        comboBox.setEditable(true);
        comboBox.addItem("生物制药");
        comboBox.addItem("临床医学");
        comboBox.addItem("计算机科学与技术");
        comboBox.addItem("软件工程");
        comboBox.setBorder(BorderFactory.createTitledBorder("请选择专业:"));
        comboBox.addItemListener(this);
        Container contentPane = jFrame.getContentPane();
        contentPane.setLayout(new GridLayout(1,2));
        JPanel jp = new JPanel();
        ta = new JTextArea(5,12);
        jp.add(comboBox);
        jp.add(ta);
        contentPane.add(new JScrollPane(list));
        contentPane.add(jp);
        jFrame.setSize(300,200);
        jFrame.setVisible(true);

    }

    public static void main(String[] args) {
        new JList_JComboBoxTest();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == comboBox) {
            ta.setText((String)comboBox.getSelectedItem());
        }
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (e.getSource()==list){
            ta.setText((String)list.getSelectedValue());
        }
    }
}
