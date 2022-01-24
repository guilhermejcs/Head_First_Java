package cap13.pag299;

import javax.swing.*;
import java.awt.*;

public class Exercicio2 {
    public static void main(String[] args) {
        Exercicio2 gui = new Exercicio2();
        gui.go();
    }

    private void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);

        JButton button = new JButton("tesuji");
        JButton buttonTwo = new JButton("watari");

        panel.add(buttonTwo);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.getContentPane().add(BorderLayout.EAST, panel);

        frame.setSize(300, 250);
        frame.setVisible(true);
    }
}

/**
 * RESPOSTA:
 *  B => 6
 */