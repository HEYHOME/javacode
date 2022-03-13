package 第十章;

import javax.swing.*;
import java.awt.*;

/**
 * @author hey
 * @description
 * @create 2020-05-29-15:36
 */
public class SimpleFrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->{
            SimpleFrame frame = new SimpleFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setResizable(false);
            frame.setLocation(500,300);
            frame.setTitle("第一个用户界面");
        });
    }
}

class SimpleFrame extends JFrame {
    // private static final int DEFAULT_WIDTH = 300;
    // private static final int DEFAULT_HEIGHT = 200;
    public SimpleFrame(){
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        // System.out.println(screenSize.getSize());
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        setSize(screenWidth/2,screenHeight/2);
        Image img = new ImageIcon("C:\\Users\\lenovo\\Desktop\\icon.png").getImage();
        setIconImage(img);
    }

}