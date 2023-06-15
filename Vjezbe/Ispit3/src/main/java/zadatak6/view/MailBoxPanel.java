package zadatak6.view;

import net.miginfocom.swing.MigLayout;
import zadatak6.controller.AUXCLS;
import zadatak6.controller.MailBoxPanelListener;
import zadatak6.model.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MailBoxPanel extends JPanel implements ActionListener {

    private JTextField usernameField;
    private JTextField mailField;
    private JTextField userIdField;
    private JButton confirmButton;
    private MailBoxPanelListener mailBoxPanelListener;

    public MailBoxPanel() {
        setBorder(BorderFactory.createTitledBorder("New Mailbox"));

        initComps();
        layoutComps();
        activateFrame();
    }

    private void initComps() {
        usernameField = new JTextField(15);
        mailField = new JTextField(15);
        userIdField = new JTextField(15);
        confirmButton = new JButton("Confirm");
    }

    private void layoutComps() {
        setLayout(new MigLayout("insets 15 30 15 15", "[][][]", "[]20[]20[]"));
        add(new JLabel("Username:"));
        add(usernameField, "wrap");
        add(new JLabel("Email adress:"));
        add(mailField, "wrap");
        add(new JLabel("User ID:"));
        add(userIdField, "wrap");
        add(new JSeparator(), "h 100%, wrap");
        add(confirmButton, "span 3, align center");
    }

    public void setMailBoxPanelListener(MailBoxPanelListener mailBoxPanelListener) {
        this.mailBoxPanelListener = mailBoxPanelListener;
    }

    private void activateFrame() {
        confirmButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == confirmButton) {
            User user = new User(usernameField.getText(), mailField.getText(), Integer.parseInt(userIdField.getText()));
            System.out.println(user);
            boolean flag = AUXCLS.addUser(user);
            System.out.println(flag);
            if (flag) {
                mailBoxPanelListener.addUserToMailbox(user);
                JOptionPane.showMessageDialog(null, "User added!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "User already exists!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            resetForm();
        }
    }

    private void resetForm() {
        usernameField.setText("");
        mailField.setText("");
        userIdField.setText("");
    }
}
