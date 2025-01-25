
import java.awt.event.*;
import javax.swing.*;

public class Example9 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Giải phương trình bậc 2");
        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        JLabel b1TieuDe = new JLabel("Giải Phương Trình bậc 2");
        b1TieuDe.setFont(b1TieuDe.getFont().deriveFont(24.0f));
        b1TieuDe.setBounds(85, 0, 300, 80);
        frame.add(b1TieuDe);

        JLabel a1A = new JLabel("a: ");
        a1A.setBounds(90, 80, 20, 25);
        frame.add(a1A);

        JLabel a2B = new JLabel("b: ");
        a2B.setBounds(90, 120, 20, 25);
        frame.add(a2B);

        JLabel a3C = new JLabel("c: ");
        a3C.setBounds(90, 160, 20, 25);
        frame.add(a3C);

        JLabel a4Ketqua = new JLabel("Kết quả: ");
        a4Ketqua.setBounds(90, 200, 50, 25);
        frame.add(a4Ketqua);

        JTextField txtSoa = new JTextField();
        txtSoa.setBounds(130, 80, 180, 25);
        frame.add(txtSoa);

        JTextField txtSob = new JTextField();
        txtSob.setBounds(130, 120, 180, 25);
        frame.add(txtSob);

        JTextField txtSoc = new JTextField();
        txtSoc.setBounds(130, 160, 180, 25);
        frame.add(txtSoc);

        JTextField txtKetqua = new JTextField();
        txtKetqua.setBounds(150, 200, 160, 25);
        frame.add(txtKetqua);

        JButton bGiai = new JButton("Gỉai");
        bGiai.setBounds(50, 250, 100, 30);
        frame.add(bGiai);

        JButton bXoatrang = new JButton("Xoá Trắng");
        bXoatrang.setBounds(180, 250, 100, 30);
        frame.add(bXoatrang);

        JButton bThoat = new JButton("Thoát");
        bThoat.setBounds(300, 250, 100, 30);
        frame.add(bThoat);

        bGiai.addActionListener((ActionEvent e) -> {
                try {
                    double a = Double.parseDouble(txtSoa.getText());
                    double b = Double.parseDouble(txtSob.getText());
                    double c = Double.parseDouble(txtSoc.getText());

                    double delta = b * b - 4 * a * c;
                    String ketQua;

                    if (delta < 0) {
                        ketQua = "Phương trình vô nghiệm";
                    } else if (delta == 0) {
                        double x = -b / (2 * a);
                        ketQua = "Phương trình có nghiệm kép: x = " + x;
                    } else {
                        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                        ketQua = "Nghiệm x1 = " + x1 + ", x2 = " + x2;
                    }

                    txtKetqua.setText(ketQua);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Vui lòng nhập số hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
        });

        // Thêm sự kiện nts xóa
        bXoatrang.addActionListener((ActionEvent e) -> {
                txtSoa.setText("");
                txtSob.setText("");
                txtSoc.setText("");
                txtKetqua.setText("");
        });
        
        //Thêm sự kiện nút thoát
        bThoat.addActionListener((ActionEvent e) -> {
                System.exit(0);
        });

        frame.setVisible(true);
    }
}