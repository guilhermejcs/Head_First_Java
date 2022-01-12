package cap12.pag261;

import javax.swing.*;
import java.awt.*;

public class FillRect extends JPanel {

    public void paintComponent(Graphics g) {
        g.setColor(Color.orange);
        g.fillRect(20,50,100,100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FillRect rect = new FillRect();
        frame.getContentPane().add(rect);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}


