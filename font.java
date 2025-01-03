import java.awt.*;
import javax.swing.*;

public class font {
    public static void main(String[] args) {
        // Tạo JFrame
        JFrame frame = new JFrame("Font Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 1));

        // Các nhãn với font chữ khác nhau
        JLabel label1 = new JLabel("This is Serif font", JLabel.CENTER);
        label1.setFont(new Font("Serif", Font.BOLD, 18));
        frame.add(label1);

        JLabel label2 = new JLabel("This is SansSerif font", JLabel.CENTER);
        label2.setFont(new Font("SansSerif", Font.ITALIC, 18));
        frame.add(label2);

        JLabel label3 = new JLabel("This is Monospaced font", JLabel.CENTER);
        label3.setFont(new Font("Monospaced", Font.PLAIN, 18));
        frame.add(label3);

        JLabel label4 = new JLabel("This is Dialog font", JLabel.CENTER);
        label4.setFont(new Font("Dialog", Font.BOLD + Font.ITALIC, 18));
        frame.add(label4);

        JLabel label5 = new JLabel("This is DialogInput font", JLabel.CENTER);
        label5.setFont(new Font("DialogInput", Font.PLAIN, 18));
        frame.add(label5);

        // Hiển thị JFrame
        frame.setVisible(true);
    }
}
