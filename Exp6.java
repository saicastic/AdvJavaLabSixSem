import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exp6 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Show Gender");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(6,6,6,6));

        JLabel label = new JLabel("Gender");

        final JRadioButton b1 = new JRadioButton("female");
        final JRadioButton b2 = new JRadioButton("male");

        ButtonGroup bg = new ButtonGroup();
        bg.add(b1);
        bg.add(b2);

        JButton button = new JButton("Show");

        final JTextField t = new JTextField(15);
        
        panel.add(label);
        panel.add(b1);
        panel.add(b2);
        panel.add(button);
        panel.add(t);

        frame.add(panel, BorderLayout.CENTER);
        frame.setSize(400,300);
        frame.setVisible(true);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if (b1.isSelected()) {
                    t.setText("female");
                } else if (b2.isSelected()) {
                    t.setText("male");
                } else {
                    t.setText("No gender selected");
                }
            }
        });
    }
}