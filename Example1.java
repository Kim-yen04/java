import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class Example1 {
    public static void main(String[] args) {
        JFrame j = new JFrame("Counter");
        j.setLayout(null);
        j.setSize (400, 200);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        JButton b = new JButton("Click me");
        b.setBounds(60, 50, 130, 50);
        b.setBackground(Color.decode("#441752"));
        b.setForeground(Color.decode("#FDF7F4"));
        j.add(b);

        JLabel l = new JLabel("Click count: 0");
        l.setBounds(250, 50, 130, 50);
        l.setBackground(Color.CYAN);
        j.add(l);

        final int[] countClick = {0};

        b.addActionListener((ActionEvent e) -> {
            countClick[0]++;
            l.setText("Click Count: " + countClick[0]);
        });
        j.setVisible(true);


    }
}