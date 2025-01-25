
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class Example8 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text Statistics");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JTextArea tA1 = new JTextArea();
        tA1.setBounds(65, 20, 340, 150);
        frame.add(tA1);

        JButton b1 = new JButton("Calculate");
        b1.setBounds(160, 210, 150, 30);
        b1.setBackground(Color.decode("#AF1740"));
        b1.setForeground(Color.decode("#FFF7D1"));
        frame.add(b1);

        JLabel l1 = new JLabel("Number of words: 0");
        l1.setBounds(180, 250, 150, 30);
        frame.add(l1);

        JLabel l2 = new JLabel("Average word length: 0");
        l2.setBounds(170, 280, 200, 30);
        frame.add(l2);
        
        b1.addActionListener((ActionEvent e) -> {
            String text = tA1.getText();
            int charCount = text.length();
            String[] words = text.trim().split("\\s+");
            int wordCount = (text.trim().isEmpty()) ? 0 : words.length;

            l1.setText("Number of words: " + wordCount);
            l2.setText("Average word length: " + 1.0 * charCount/wordCount);
        });
        frame.setVisible(true);
    }
}