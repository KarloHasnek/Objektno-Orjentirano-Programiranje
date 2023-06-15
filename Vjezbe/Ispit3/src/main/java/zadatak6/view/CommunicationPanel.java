package zadatak6.view;

import net.miginfocom.swing.MigLayout;
import zadatak6.controller.AUXCLS;
import zadatak6.model.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

public class CommunicationPanel extends JPanel implements ActionListener {

    private JComboBox<String> mailboxSelector;
    private JButton newMailButton;
    private JButton listAllMailsButton;

    public CommunicationPanel() {
        setBorder(BorderFactory.createTitledBorder("Communication"));

        initComps();
        layoutComps();
        activateFrame();
    }

    private void initComps() {
        mailboxSelector = new JComboBox<>();
        newMailButton = new JButton("Compose mail");
        listAllMailsButton = new JButton("List all mails");
        readMailbox();
    }

    private void layoutComps() {
        setLayout(new MigLayout("insets 15 30 15 15, center", "[][][]", "[][][]"));
        add(new JLabel("Select mailbox:"), "wrap");
        add(mailboxSelector, "wrap, w 150:150:150");
        add(newMailButton, "span, wrap, pad 10 0 10 0, align center");
        add(new JSeparator(), "h 100%, wrap");
        add(listAllMailsButton, "span 2, align center");
    }

    private void activateFrame() {
        newMailButton.addActionListener(this);
        listAllMailsButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == newMailButton) {
            new NewMailFrame(mailboxSelector.getSelectedItem().toString());
        } else if (e.getSource() == listAllMailsButton) {
            new AllMailsFrame();
        }
    }

    public void updateMailbox(User user) {
        mailboxSelector.addItem(user.getMail());
    }

    public void readMailbox() {
        for (User user : AUXCLS.mailbox) {
            mailboxSelector.addItem(user.getMail());
        }
    }
}
