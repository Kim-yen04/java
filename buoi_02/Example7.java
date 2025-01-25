import java.awt.Color;
import javax.swing.*;
public class Example7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel l1 = new JLabel("Hello Java");
        l1.setFont(l1.getFont().deriveFont(24.0f));
        l1.setBounds(120, 10, 300, 40);

        JMenu m1 = new JMenu("Text Colors");
        JMenu m2 = new JMenu("Background");

        JMenuItem blueText = new JMenuItem("Blue");
        JMenuItem yellowText = new JMenuItem("yellow");
        JMenuItem redText = new JMenuItem("red");

        JMenuItem blueBackground = new JMenuItem("Blue");
        JMenuItem yellowBackground = new JMenuItem("Yellow");
        JMenuItem redBackground = new JMenuItem("Red");

        blueText.addActionListener(e -> l1.setForeground(Color.BLUE));
        yellowText.addActionListener(e -> l1.setForeground(Color.YELLOW));
        redText.addActionListener(e -> l1.setForeground(Color.RED));

        blueBackground.addActionListener(e -> frame.getContentPane().setBackground(Color.BLUE));
        yellowBackground.addActionListener(e -> frame.getContentPane().setBackground(Color.YELLOW));
        redBackground.addActionListener(e -> frame.getContentPane().setBackground(Color.RED));
        
        m1.add(blueText);
        m1.add(yellowText);
        m1.add(redText);

        m2.add(blueBackground);
        m2.add(yellowBackground);
        m2.add(redBackground);

        JMenuBar mb = new JMenuBar();
        mb.add(m1);
        mb.add(m2);

        frame.setJMenuBar(mb);
        frame.add(l1);

        frame.setVisible(true);
    }
}