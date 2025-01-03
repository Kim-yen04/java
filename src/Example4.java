import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example4 {
    public static void main(String[] args) {
        JFrame f = new JFrame("RadioButtonDemo");
        f.setSize(500, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new BorderLayout());

        // Tạo các RadioButton
        JRadioButton rb1 = new JRadioButton("Fish");
        JRadioButton rb2 = new JRadioButton("Cat");
        JRadioButton rb3 = new JRadioButton("Dog");
        JRadioButton rb4 = new JRadioButton("Rabbit");
        JRadioButton rb5 = new JRadioButton("Horse");

        // Nhóm các RadioButton lại với nhau
        ButtonGroup g = new ButtonGroup();
        g.add(rb1);
        g.add(rb2);
        g.add(rb3);
        g.add(rb4);
        g.add(rb5);

        // Panel chứa các nút RadioButton
        JPanel radioJPanel = new JPanel(new GridLayout(5, 1));
        radioJPanel.add(rb1);
        radioJPanel.add(rb2);
        radioJPanel.add(rb3);
        radioJPanel.add(rb4);
        radioJPanel.add(rb5);

        // Label để hiển thị hình ảnh
        JLabel l1 = new JLabel("", JLabel.CENTER);

        // Thêm sự kiện cho từng RadioButton
        ActionListener listener = e -> {
            String image = " ";
            JRadioButton source = (JRadioButton) e.getSource();
            switch (source.getText()) {
                case "Fish":
                    image = "fish.jpg";
                    
                    break;
                case "Cat":
                    image = "cat.jpg";
                    break;
                case "Dog":
                    image = "dog.jpg";
                    break;
                case "Rabbit":
                    image = "rabbit.jpg";
                    break;
                case "Horse":
                    image = "horse.jpg";
                    break;
            }
            ImageIcon icon = new ImageIcon(Example4.class.getClassLoader().getResource("anh/" + image));
            Image img = icon.getImage();
            Image resizedImg = img.getScaledInstance(l1.getWidth(), l1.getHeight(), Image.SCALE_SMOOTH);
            l1.setIcon(new ImageIcon(resizedImg));

        };

        rb1.addActionListener(listener);
        rb2.addActionListener(listener);
        rb3.addActionListener(listener);
        rb4.addActionListener(listener);
        rb5.addActionListener(listener);

        // Thêm panel radioJPanel vào bên trái của JFrame
        f.add(radioJPanel, BorderLayout.WEST);

        // Thêm label l1 (hiển thị hình ảnh) vào bên phải của JFrame
        f.add(l1, BorderLayout.CENTER);
        
        f.setVisible(true);
    }
}
