import javax.swing.*;

public class Exp2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("How");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello World");

        frame.add(label);

        // Set the size of the frame
        frame.setSize(400, 400);

        // Center the frame on the screen
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);
    }
}

