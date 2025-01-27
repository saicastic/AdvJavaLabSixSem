import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exp7 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bill");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JCheckBox C1 = new JCheckBox("Samosa(15)");
        JCheckBox C2 = new JCheckBox("Tea(10)");
        JCheckBox C3 = new JCheckBox("Coffee(10)");
        JCheckBox C4 = new JCheckBox("Sandwich(30)");

        JLabel l = new JLabel("Result :");
        JTextField t = new JTextField(10);
        JButton b = new JButton("Total");

        frame.setLayout(new FlowLayout());

        frame.add(C1);
        frame.add(C2);
        frame.add(C3);
        frame.add(C4);
        frame.add(b);
        frame.add(l);
        frame.add(t);

        frame.setSize(500,500);
        frame.setVisible(true);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int total = 0;
                if (C1.isSelected()) {
                    total+=15;
                }
                if (C2.isSelected()) {
                    total += 10;
                }
                if (C3.isSelected()) {
                    total += 10;
                }
                if (C4.isSelected()) {
                    total += 30;
                }

                t.setText(" "+total);
            }
        });
    }
}