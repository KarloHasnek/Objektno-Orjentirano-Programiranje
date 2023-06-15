package zadatak6.test;

import com.formdev.flatlaf.FlatLightLaf;
import zadatak6.controller.AUXCLS;
import zadatak6.model.User;
import zadatak6.view.MainFrame;

import javax.swing.*;

public class AppTest {

    public static void main(String[] args) {

        User user1 = new User("user1", "user1@mail.com", 1);
        User user2 = new User("user2", "user2@mail.com", 2);
        User user3 = new User("user3", "user3@mail.com", 3);
        User user4 = new User("user4", "user4@mail.com", 4);
        AUXCLS.addUser(user1);
        AUXCLS.addUser(user2);
        AUXCLS.addUser(user3);
        AUXCLS.addUser(user4);

        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
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
