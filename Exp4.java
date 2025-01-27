import javax.swing.*;
import java.awt.*;

public class Exp4 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout());

        JPanel panel = new JPanel(new GridLayout(3,2));

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");

        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);

        frame.add(panel);

        frame.setSize(400,300);
        frame.setVisible(true);
    }
}