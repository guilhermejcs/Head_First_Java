package cap12.pag281.seja_o_compilador;

import javax.swing.*;
import java.awt.*;

class InnerButton {

    JFrame frame;
    JButton b;

    public static void main(String[] args) {
        InnerButton gui = new InnerButton();
        gui.go();
    }

    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b = new JButton("A");
        b.addActionListener();

        frame.getContentPane().add(BorderLayout.SOUTH, b);
        frame.setSize(200, 100);
    }
}
