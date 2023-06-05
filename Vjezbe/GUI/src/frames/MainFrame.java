package frames;

import javax.swing.*;

public class MainFrame extends JFrame {

    // Konstruktor MainFrame-a
    public MainFrame() {

        // Title in titlebar of the app
        super("Aplikacija");

        // Default values and frame actions
        setSize(1280, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Sets JFrame to center of the screen
        setVisible(true);
    }
}
