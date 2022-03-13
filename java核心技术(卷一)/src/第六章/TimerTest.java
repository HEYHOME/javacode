package 第六章;

import javax.swing.*;
import java.awt.*;
import java.time.Instant;

/**
 * @author hey
 * @description
 * @create 2020-06-01-21:52
 */
public class TimerTest {
    public static void main(String[] args) {
        // var listener = new TimePrinter();
        var timer = new Timer(1000,event->{
            System.out.println("At the tone,the time is "+ Instant.ofEpochMilli(event.getWhen()));
            Toolkit.getDefaultToolkit().beep();
        });
        timer.start();
        

        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);
    }
}

/*
class TimePrinter implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("At the tone,the time is "+ Instant.ofEpochMilli(e.getWhen()));
        Toolkit.getDefaultToolkit().beep();
    }
}*/
