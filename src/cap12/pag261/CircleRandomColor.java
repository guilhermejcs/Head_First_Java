package cap12.pag261;

import javax.swing.*;
import java.awt.*;

public class CircleRandomColor extends JPanel {

    public void paintComponent(Graphics g) {
        g.fillRect(0,0,this.getWidth(), this.getHeight());

        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);

        Color randomColor = new Color(red,green,blue);
        g.setColor(randomColor);
        g.fillOval(70,70,100,100);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CircleRandomColor circle = new CircleRandomColor();
        frame.getContentPane().add(circle);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}


