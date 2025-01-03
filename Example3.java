
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class Example3 {
    public static void main(String[] args) {
        JFrame j = new JFrame("Background");
        j.setSize(300, 250);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setLayout(null);
        String[] colors = {"White", "Green", "Yellow", "Red"};
        
        //add comboBox
        JComboBox<String> cb = new JComboBox<>(colors);
        cb.setBounds(100, 30, 80, 50);
        j.add(cb);

        //Hoat dong cho button
        cb.addActionListener((ActionEvent e) -> {
            String chonMau = (String) cb.getSelectedItem();
            switch (chonMau) {
                case "White":
                    j.getContentPane().setBackground(Color.white);
                    break;
                case "Green":
                    j.getContentPane().setBackground(Color.green);
                    break;
                case "Blue":
                    j.getContentPane().setBackground(Color.blue);
                    break;
                case "Yellow":
                    j.getContentPane().setBackground(Color.yellow);
                    break;
                case "Red":
                    j.getContentPane().setBackground(Color.red);
                    break;
                default:
            }
        });
    j.setVisible(true);
    }
}