import javax.swing.*;
import java.awt.*;

public class Exp1{
    public static void main(String args[]){

          JFrame frame = new JFrame("Hello Message");       
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

          JLabel label= new JLabel("Hello World", SwingConstants.CENTER);

          frame.getContentPane().add(label, BorderLayout.CENTER);
          frame.setSize(300,400);
          frame.setVisible(true);
    }
}