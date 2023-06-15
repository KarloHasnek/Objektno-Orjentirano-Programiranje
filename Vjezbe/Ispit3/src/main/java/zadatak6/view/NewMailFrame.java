package zadatak6.view;

import net.miginfocom.swing.MigLayout;
import zadatak6.controller.AUXCLS;
import zadatak6.model.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewMailFrame extends JFrame implements ActionListener {

    public static final int WIDTH = 600;
    public static final int HEIGHT = 450;

    private JTextField fromField;
    private JComboBox<String> toComboBox;
    private JTextArea messageArea;
    private JScrollPane messageScrollPane;
    private JButton sendButton;

    public NewMailFrame(String fromEmail) {
        setTitle("Main window");
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);

        initComps(fromEmail);
        layoutComps();
        activateFrame();
    }

    private void initComps(String fromEmail) {
        fromField = new JTextField();
        fromField.setEditable(false);
        fromField.setText(fromEmail);
        toComboBox = new JComboBox<>();
        for (User user : AUXCLS.mailbox) {
            if (!user.getMail().equals(fromField.getText())) {
                toComboBox.addItem(user.getMail());
            }
        }
        messageArea = new JTextArea();
        messageScrollPane = new JScrollPane(messageArea);
        messageScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        sendButton = new JButton("Send");
    }

    private void layoutComps() {
        setLayout(new MigLayout("insets 5 20 15 20"));
        add(new JLabel("From:"), "align right");
        add(fromField, "wrap, w 150");
        add(new JLabel("To:"), "align right");
        add(toComboBox, "wrap, w 150");
        add(messageScrollPane, "w 100%, h 100%, span 2");
        add(sendButton, "aligny bottom");

    }

    private void activateFrame() {
        sendButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sendButton){
            String mail = messageArea.getText();
            String fromUser = fromField.getText();
            String toUser = toComboBox.getSelectedItem().toString();

            String separator = "\n----------------------------------------";
            AUXCLS.addMailToInbox(fromUser, "TO: " + toUser + "\n" + mail + separator);
            AUXCLS.addMailToInbox(toUser, "FROM: " + fromUser + "\n" + mail + separator);

            dispose();
            JOptionPane.showMessageDialog(null, "Mail sent successfully!");

            AUXCLS.printAllMail();
        }
    }
}

