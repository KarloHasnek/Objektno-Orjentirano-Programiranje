package frames;

import client.ClientPanel;
import login.LoginListener;
import login.LoginPanel;
import login.LoginPanelEvent;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    // Atributi MainFrame-a (paneli)
    private LoginPanel loginPanel;
    private PopupFrame popupFrame;
    private ClientPanel clientPanel;

    // Konstruktor MainFrame-a
    public MainFrame() {

        // Title in titlebar of the app
        super("Aplikacija");

        // Default values and frame actions
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Sets JFrame to center of the screen
        setVisible(true);
        setResizable(true);

        // initialize components, layout components and activate app
        initComps();
        layoutComps();
        activateApp();
    }

    private void initComps(){
        loginPanel = new LoginPanel();
        popupFrame = new PopupFrame();
        clientPanel = new ClientPanel();
    }

    private void layoutComps(){
        add(loginPanel, BorderLayout.CENTER);
        popupFrame.setVisible(false);
        add(clientPanel, BorderLayout.NORTH);
        clientPanel.setVisible(false);
    }

    private void activateApp(){

        loginPanel.setLoginListener(new LoginListener() {
            @Override
            public void loginEventOccured(LoginPanelEvent event) {
                String username = event.getUsername();
                String password = event.getPassword();

                if (username.equals("admin") && password.equals("admin")) {
                    loginPanel.setVisible(false);
                    clientPanel.setVisible(true);
                    changeResizable();
                    setLocationRelativeTo(null);
                } else {
                    JOptionPane.showMessageDialog(popupFrame, "Wrong username or password!", "Login failed", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        loginPanel.activateComps();

    }

    private void changeResizable(){
        if (isResizable()) {
            setSize(800, 600);
            setResizable(false);
        } else {
            setResizable(true);
        }
    }

}
