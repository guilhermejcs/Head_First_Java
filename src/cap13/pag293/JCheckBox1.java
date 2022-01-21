package cap13.pag293;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JCheckBox1 implements ItemListener {

    JCheckBox check;

    public static void main(String[] args) {
        JCheckBox1 gui = new JCheckBox1();
        gui.go();
    }

    private void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        check = new JCheckBox("Goes to 11");
        check.addItemListener(this);

        frame.getContentPane().add(BorderLayout.CENTER, check);

        frame.setSize(300, 200);
        frame.setVisible(true);
    }


    public void itemStateChanged(ItemEvent e) {
        String onOrOff = "off";
        if(check.isSelected()) onOrOff = "on";
        System.out.println("Check box is " + onOrOff);
    }
}
