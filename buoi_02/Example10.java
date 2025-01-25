import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Example10 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Account");
        f.setSize(600, 500);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Thêm các label và textField
        JLabel l1 = new JLabel("Account Number:");
        l1.setBounds(20, 20, 100, 30);
        f.add(l1);
        
        JTextField t1 = new JTextField();
        t1.setBounds(150, 20, 200, 25);
        f.add(t1);
        
        JLabel l2 = new JLabel("Account Name:");
        l2.setBounds(20, 60, 100, 30);
        f.add(l2);
        
        JTextField t2 = new JTextField();
        t2.setBounds(150, 60, 200, 25);
        f.add(t2);
        
        JLabel l3 = new JLabel("Account Money:");
        l3.setBounds(20, 100, 100, 30);
        f.add(l3);
        
        JTextField t3 = new JTextField();
        t3.setBounds(150, 100, 200, 25);
        f.add(t3);

        // Thêm bảng và các cột của bảng
        String[] columns = {"Acc Number", "Acc Name", "Acc Money"};
        DefaultTableModel tableModel = new DefaultTableModel(columns, 0);
        JTable table = new JTable(tableModel);
        JScrollPane sP = new JScrollPane(table);
        sP.setBounds(20, 140, 450, 150);
        f.add(sP);
        
        // Thêm các Buttons
        JButton btnAdd = new JButton("Add");
        btnAdd.setBounds(50, 300, 80, 30);
        f.add(btnAdd);

        JButton btnClear = new JButton("Clear");
        btnAdd.setBounds(200, 300, 80, 30);
        f.add(btnClear);
        
        JButton btnDelete = new JButton("Delete");
        btnDelete.setBounds(280, 300, 80, 30);
        f.add(btnDelete);
        
        JButton btnExit = new JButton("Exit");
        btnExit.setBounds(350, 300, 80, 30);
        f.add(btnExit);
        
        //Thêm sự kiện nút thêm
        btnAdd.addActionListener((ActionEvent e) -> {
                String accNumber = t1.getText();
                String accName = t2.getText();
                String accMoney = t3.getText();
                if (!accNumber.isEmpty() && !accName.isEmpty() && !accMoney.isEmpty()) {
                    tableModel.addRow(new Object[]{accNumber, accName, accMoney});
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                } else {
                    JOptionPane.showMessageDialog(f, "Vui lòng điền vào tất cả các trường.");
                }
        });

        btnClear.addActionListener((ActionEvent e) -> {
                t1.setText("");
                t2.setText("");
                t3.setText("");
        });

        // Nút xóa
        btnDelete.addActionListener((ActionEvent e) -> {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    tableModel.removeRow(selectedRow);
                }else{
                    JOptionPane.showMessageDialog(f, "Vui lòng chọn 1 dòng để xóa");
                }
        });
        // Nút thoát
        btnExit.addActionListener((ActionEvent e) -> {
                System.exit(0);
        });

        f.setVisible(true);
    }
}
