
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class Example5{
    public static void main(String[] args) {
        JFrame j = new JFrame("Food Ordering");
        j.setSize(500, 400);
        j.setLayout(null);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel l1 = new JLabel("MENU", JLabel.CENTER);
        l1.setBounds(0, 20, 500, 30);
        l1.setFont(new Font("Serif", Font.BOLD, 18));
        l1.setForeground(Color.decode("#441752"));
        j.add(l1);

        JLabel l2 = new JLabel("----------------------------------", JLabel.CENTER);
        l2.setBounds(0, 40, 500, 30);
        l2.setForeground(Color.decode("#441752"));
        j.add(l2);

        //-----------------------------------------------
        JCheckBox cb1 = new JCheckBox("Pizza             25$");
        cb1.setBounds(50, 70, 200, 30); // Chỉnh kích thước
        j.add(cb1);

        JCheckBox cb2 = new JCheckBox("Hamburger   25$");
        cb2.setBounds(50, 110, 200, 30);
        j.add(cb2);

        JCheckBox cb3 = new JCheckBox("Cream             5$");
        cb3.setBounds(50, 150, 200, 30);
        j.add(cb3);

        JCheckBox cb4 = new JCheckBox("Coffee           15$");
        cb4.setBounds(50, 190, 200, 30);
        j.add(cb4);

        //-----------------------------------------------
        JCheckBox cb5 = new JCheckBox("Coca                   20$");
        cb5.setBounds(300, 70, 200, 30); // Chỉnh kích thước
        j.add(cb5);

        JCheckBox cb6 = new JCheckBox("Sting                     7$");
        cb6.setBounds(300, 110, 200, 30);
        j.add(cb6);

        JCheckBox cb7 = new JCheckBox("Number One      10$");
        cb7.setBounds(300, 150, 200, 30);
        j.add(cb7);

        JCheckBox cb8 = new JCheckBox("StrongBow         30$");
        cb8.setBounds(300, 190, 200, 30);
        j.add(cb8);
        //-----------------------------------------------

        // Nút "Order"
        JButton b1 = new JButton("Order");
        b1.setBounds(200, 250, 80, 25);
        j.add(b1);

        b1.addActionListener((ActionEvent e) -> {
            int total = 0;
            StringBuilder mes = new StringBuilder();
            if(cb1.isSelected()){
                total += 25;
                mes.append("Pizza: $25\n");
            }
            if(cb2.isSelected()){
                total += 20;
                mes.append("Burger: $20\n");
            }
            if(cb3.isSelected()){
                total += 5;
                mes.append("Cream: $5\n");
            }
            if(cb4.isSelected()){
                total += 10;
                mes.append("Coffee: $10\n");
            }
            //-------------------------------------
            if(cb5.isSelected()){
                total += 20;
                mes.append("Coca: $20\n");
            }
            if(cb6.isSelected()){
                total += 7;
                mes.append("Burger: $7\n");
            }
            if(cb7.isSelected()){
                total += 10;
                mes.append("Tea: $10\n");
            }
            if(cb8.isSelected()){
                total += 30;
                mes.append("Coffee: $30\n");
            }
            
            mes.append("---------------\n");
            mes.append("total: $" + total);
            
            JOptionPane.showMessageDialog(j,mes.toString());
        });

        j.setVisible(true);
    }
}