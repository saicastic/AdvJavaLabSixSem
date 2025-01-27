import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exp5 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout());
        
        JPanel panel = new JPanel(new GridLayout(4,2,10,10));

        JLabel l1 = new JLabel("No. 1  :");
        JLabel l2 = new JLabel("No. 2  :");
        JLabel l3 = new JLabel("Result :");

        JTextField t1 = new JTextField(15);
        JTextField t2 = new JTextField(15);
        JTextField t3 = new JTextField(15);

        JPanel panel2 = new JPanel(new GridLayout(1,4,10,10));

        JButton b1 = new JButton("+");
        JButton b2 = new JButton("-");
        JButton b3 = new JButton("*");
        JButton b4 = new JButton("/");

        panel.add(l1);
        panel.add(t1);
        panel.add(l2);
        panel.add(t2);

        panel.add(new JLabel());

        panel2.add(b1);
        panel2.add(b2);
        panel2.add(b3);
        panel2.add(b4);
        panel.add(panel2);
    
        panel.add(l3);
        panel.add(t3);

        frame.add(panel);


    
        frame.setSize(400,500);
        frame.setVisible(true);
        t3.setEditable(false);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                try{
                    int n1 = Integer.parseInt(t1.getText());
                    int n2 = Integer.parseInt(t2.getText());

                    int result = n1 + n2;
                    t3.setText(" "+result);
                }catch(NumberFormatException ex){
                    t3.setText("Invalid Input");
                }
            }
        }); 
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                try{
                    int n1 = Integer.parseInt(t1.getText());
                    int n2 = Integer.parseInt(t2.getText());

                    int result = n1 - n2;
                    t3.setText(" "+result);
                }catch(NumberFormatException ex){
                    t3.setText("Invalid Input");
                }
            }
        }); 
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                try{
                    int n1 = Integer.parseInt(t1.getText());
                    int n2 = Integer.parseInt(t2.getText());

                    int result = n1 * n2;
                    t3.setText(" "+result);
                }catch(NumberFormatException ex){
                    t3.setText("Invalid Input");
                }
            }
        }); 
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                try{
                    int n1 = Integer.parseInt(t1.getText());
                    int n2 = Integer.parseInt(t2.getText());

                    int result = n1 / n2;
                    t3.setText(" "+result);
                }catch(NumberFormatException ex){
                    t3.setText("Invalid Input");
                }
            }
        }); 
    }
}