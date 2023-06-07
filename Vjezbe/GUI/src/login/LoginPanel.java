package login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPanel extends JPanel {

    // Komponente koje zelimo imati na panelu
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton confirmButton;
    private LoginListener loginPanelListener;

    // Konstruktor panela
    public LoginPanel() {

        // Inicijalizacija komponenti
        initComps();

        // Dodavanje komponenti na panel
        layoutComps();
    }

    private void initComps(){
        Dimension dim = this.getPreferredSize();
        dim.height = 150;
        usernameField = new JTextField(10);
        passwordField = new JPasswordField(10);
        confirmButton = new JButton("Confirm");
    }

    private void layoutComps(){
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridy = 0;
        gbc.gridx = 0;
        add(new JLabel("Name: "), gbc);
        gbc.gridy = 1;
        add(new JLabel("Password: "), gbc);
        gbc.gridy = 2;
        gbc.gridx = 1;
        add(Box.createVerticalStrut(10), gbc);
        add(confirmButton, gbc);
        gbc.gridy = 0;
        add(Box.createHorizontalStrut(15), gbc);
        add(usernameField, gbc);
        gbc.gridy = 1;
        add(Box.createHorizontalStrut(15), gbc);
        add(passwordField, gbc);
    }

    public void setLoginListener(LoginListener listener) {
        this.loginPanelListener = listener;
        System.out.println("Listener: " + (listener != null));
    }

    public void activateComps() {

        System.out.println("Login panel listener: " + (this.loginPanelListener != null));

        if (loginPanelListener != null) {

            confirmButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    String username = usernameField.getText();
                    char[] password1 = passwordField.getPassword();
                    StringBuilder password = new StringBuilder();
                    for (char ch : password1) {
                        password.append(ch);
                    }
                    System.out.println("Username: " + username + ", password: " + password);

                    LoginPanelEvent event = new LoginPanelEvent(this, username, password.toString());
                    loginPanelListener.loginEventOccured(event);
                    resetForm();
                }
            });
        }
    }

    private void resetForm(){
        passwordField.setText(null);
    }
}
