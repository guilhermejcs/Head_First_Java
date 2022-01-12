package cap12.pag261;

import javax.swing.*;
import java.awt.*;

public class ImageComponent extends JPanel {

    public void paintComponent(Graphics g) {
        Image image = new ImageIcon("src/cap12/pag261/catzilla.jpg").getImage();

        g.drawImage(image, 3,4,this);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageComponent image = new ImageComponent();
        frame.getContentPane().add(image);

        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}


