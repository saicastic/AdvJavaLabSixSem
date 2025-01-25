import javax.swing.*; // Importing Swing library for GUI components
import java.awt.*;    // Importing AWT library for layout management

public class Exp1 {
    public static void main(String args[]) {

        // Create a new JFrame (top-level window) with the title "Hello Message"
        JFrame frame = new JFrame("Hello Message");       
        // Set the default close operation to exit the program when the frame is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JLabel with the text "Hello World" and center the text horizontally
        JLabel label = new JLabel("Hello World", SwingConstants.CENTER);

        // Add the label to the content pane of the frame, positioning it in the center
        frame.getContentPane().add(label, BorderLayout.CENTER);

        // Set the size of the frame to 300 pixels wide and 400 pixels tall
        frame.setSize(300, 400);

        // Make the frame visible on the screen
        frame.setVisible(true);
    }
}
