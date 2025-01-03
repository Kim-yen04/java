
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Example6 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(470, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

        JLabel label1 = new JLabel("Phone Book", JLabel.CENTER);
        label1.setFont(new Font("Serif", Font.BOLD, 18));
        label1.setBounds(175, 40, 100, 30);
        frame.add(label1);

        JButton button1 = new JButton("Add Contact");
        button1.setBounds(50, 280, 120, 30);
        button1.setBackground(Color.decode("#441752"));
        button1.setForeground(Color.decode("#FFFAEC"));
        frame.add(button1);

        JButton button2 = new JButton("Delete Contact");
        button2.setBounds(280, 280, 120, 30);
        button2.setBackground(Color.decode("#441752"));
        button2.setForeground(Color.decode("#FFFAEC"));
        frame.add(button2);

        //create table
        String[] phoneBook = {"Name", "Phone no", "Address"};
        DefaultTableModel tbModel = new DefaultTableModel(phoneBook, 0);
        JTable table1 = new JTable(tbModel);
        JScrollPane scp = new JScrollPane(table1);
        scp.setBounds(50, 80, 350, 180);
        frame.add(scp);
        
        //add button
        button1.addActionListener((ActionEvent e) -> {
            String name = JOptionPane.showInputDialog("Name");
            String phone = JOptionPane.showInputDialog("Phone");
            String address = JOptionPane.showInputDialog("Address");
            tbModel.addRow(new Object[] {name, phone, address});
        });

        button2.addActionListener((ActionEvent e) -> {
            int selectedRow = table1.getSelectedRow();
            if (selectedRow != -1){
                tbModel.removeRow(selectedRow);
            }else{
                JOptionPane.showMessageDialog(frame, "Chọn một hàng để xóa.");
            }
        });
        frame.setVisible(true);
    }
}