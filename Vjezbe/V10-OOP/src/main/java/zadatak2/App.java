package zadatak2;

import zadatak2.MainFrame;
import com.formdev.flatlaf.FlatDarculaLaf;
import javax.swing.*;

public class App {

    public static void main(String[] args) {

         try {
             UIManager.setLookAndFeel(new FlatDarculaLaf());
         } catch (UnsupportedLookAndFeelException e) {
             throw new RuntimeException(e);
         }
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame();
            }
        });
    }
}
