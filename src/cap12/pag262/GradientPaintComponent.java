package cap12.pag262;

import javax.swing.*;
import java.awt.*;

public class GradientPaintComponent extends JPanel {

    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        GradientPaint gradient = new GradientPaint(70,70,Color.blue, 150,150,Color.orange);
        g2d.setPaint(gradient);
        g.fillOval(70,70,100,100);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GradientPaintComponent circle = new GradientPaintComponent();
        frame.getContentPane().add(circle);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}


