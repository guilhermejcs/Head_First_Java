package cap13.pag288;

import javax.swing.*;

public class BorderLayout1 {
    public static void main(String[] args) {
        BorderLayout1 gui = new BorderLayout1();
        gui.go();
    }

    private void go() {
        JFrame frame = new JFrame();
        JButton east = new JButton("east");
        JButton west = new JButton("west");
        JButton north = new JButton("north");
        JButton south = new JButton("south");
        JButton center = new JButton("center");

        frame.getContentPane().add(java.awt.BorderLayout.EAST, east);
        frame.getContentPane().add(java.awt.BorderLayout.WEST, west);
        frame.getContentPane().add(java.awt.BorderLayout.NORTH, north);
        frame.getContentPane().add(java.awt.BorderLayout.SOUTH, south);
        frame.getContentPane().add(java.awt.BorderLayout.CENTER, center);

        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
