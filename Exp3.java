import javax.swing.*;
import java.awt.*;

public class Exp3 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Image Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        ImageIcon img = new ImageIcon("assets/duckScene.jpg");
        Image scaledImage = img.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        img = new ImageIcon(scaledImage);
        JLabel label = new JLabel(img);

        // Add the image to the frame
        frame.add(label, BorderLayout.CENTER);

        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        
        
        frame.setSize(800,1400);
        frame.setVisible(true);
        
    }
}