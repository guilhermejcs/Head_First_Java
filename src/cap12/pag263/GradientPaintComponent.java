package cap12.pag263;

import javax.swing.*;
import java.awt.*;

public class GradientPaintComponent extends JPanel {

    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color startColor = new Color(red,green,blue);

        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);
        Color endColor = new Color(red,green,blue);

        GradientPaint gradient = new GradientPaint(70,70,startColor, 150,150,endColor);
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


