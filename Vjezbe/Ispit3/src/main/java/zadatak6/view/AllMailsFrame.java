package zadatak6.view;

import net.miginfocom.swing.MigLayout;
import zadatak6.controller.AUXCLS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AllMailsFrame extends JFrame implements ActionListener {

    private JComboBox<String> mailsFor;
    private JTextArea mailsList;
    private JScrollPane mailsListScrollable;
    private JButton closeButton;

    public AllMailsFrame() {
        setTitle("All mails");
        setSize(NewMailFrame.WIDTH, NewMailFrame.HEIGHT);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);

        initComps();
        layoutComps();
        activateFrame();
    }

    private void initComps() {
        mailsFor = new JComboBox<>();
        for (String mail : AUXCLS.inbox.keySet()) {
            mailsFor.addItem(mail);
        }
        mailsFor.setSelectedIndex(-1);
        mailsList = new JTextArea();
        mailsList.setEditable(false);
        mailsList.setFont(new Font("Consolas", Font.PLAIN, 16));
        mailsList.setLineWrap(true);
        mailsListScrollable = new JScrollPane(mailsList);
        mailsListScrollable.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        mailsListScrollable.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        closeButton = new JButton("Close");

    }

    private void layoutComps() {
        setLayout(new MigLayout("insets 5 20 15 20, center"));
        add(new JLabel("Mails for:"), "align right");
        add(mailsFor, "wrap, w 150");
        add(mailsListScrollable, "w 100%, h 100%, span, wrap");
        add(closeButton, "span, align center, aligny bottom");
    }

    private void activateFrame() {
        mailsFor.addActionListener(this);
        closeButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (mailsFor != null) {
            String userMail = mailsFor.getSelectedItem().toString();
            mailsList.setText(AUXCLS.inbox.get(userMail));
        }
        if (e.getSource() == closeButton) {
            dispose();
        }
    }
}
