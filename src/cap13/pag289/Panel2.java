package cap13.pag289;

import javax.swing.*;
import java.awt.*;

public class Panel2 {
    public static void main(String[] args) {
        Panel2 gui = new Panel2();
        gui.go();
    }

    private void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);

        JButton button = new JButton("shock me");

        panel.add(button);
        frame.getContentPane().add(BorderLayout.EAST, panel);

        frame.setSize(250, 200);
        frame.setVisible(true);
    }
}
