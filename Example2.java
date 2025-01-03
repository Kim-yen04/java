
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class Example2 {
    public static void main(String[] args) {
        JFrame j = new JFrame("Simple Calculator");
        j.setSize(300, 300);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setLayout(null);

        //Tạo các label
        JLabel l1 = new JLabel("Num 1");
        l1.setBounds(20, 0, 50, 50);
        l1.setFont(new Font("Arial", Font.BOLD, 15));
        l1.setForeground(Color.decode("#500073"));
        j.add(l1);

        JLabel l2 = new JLabel("Num 2");
        l2.setBounds(20, 40, 50, 50);
        l2.setFont(new Font("Arial", Font.BOLD, 15));
        l2.setForeground(Color.decode("#500073"));
        j.add(l2);

        JLabel l3 = new JLabel("Result");
        l3.setBounds(20, 80, 50, 50);
        l3.setFont(new Font("Arial", Font.BOLD, 15));
        l3.setForeground(Color.decode("#500073"));
        j.add(l3);

        //tạo các text field
        JTextField t1 = new JTextField();
        t1.setBounds(80, 15, 110, 20);
        j.add(t1);

        JTextField t2 = new JTextField();
        t2.setBounds(80, 55, 110, 20);
        j.add(t2);

        JTextField t3 = new JTextField();
        t3.setBounds(80, 95, 110, 20);
        j.add(t3);

        //Tạo các BUTTON
        JButton b1 = new JButton("+");
        b1.setBounds(40, 150, 50, 40);
        b1.setBackground(Color.decode("#123524"));
        b1.setForeground(Color.decode("#EFE3C2"));
        j.add(b1);

        JButton b2 = new JButton("-");
        b2.setBounds(90, 150, 50, 40);
        b2.setBackground(Color.decode("#123524"));
        b2.setForeground(Color.decode("#EFE3C2"));
        j.add(b2);

        JButton b3 = new JButton("*");
        b3.setBounds(140, 150, 50, 40);
        b3.setBackground(Color.decode("#123524"));
        b3.setForeground(Color.decode("#EFE3C2"));
        j.add(b3);

        JButton b4 = new JButton("/");
        b4.setBounds(190, 150, 50, 40);
        b4.setBackground(Color.decode("#123524"));
        b4.setForeground(Color.decode("#EFE3C2"));
        j.add(b4);

        //add sự kiện cho các nút
        b1.addActionListener((ActionEvent e) -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int tong = a + b;
            t3.setText(" " + tong);
        });

        b2.addActionListener((ActionEvent e) -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int hieu = a - b;
            t3.setText(" " + hieu);
        });

        b3.addActionListener((ActionEvent e) -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int tich = a * b;
            t3.setText(" " + tich);
        });

        b4.addActionListener((ActionEvent e) -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            int thuong = a / b;
            t3.setText(" " + thuong);
        });
        j.setVisible(true);
    }
}