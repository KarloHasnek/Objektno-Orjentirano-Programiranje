package zadatak6.view;

import net.miginfocom.swing.MigLayout;
import zadatak6.controller.MailBoxPanelListener;
import zadatak6.model.User;
import zadatak6.view.CommunicationPanel;
import zadatak6.view.MailBoxPanel;

import javax.swing.*;

public class MainFrame extends JFrame {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private JMenuBar menuBar;
    private MailBoxPanel mailBoxPanel;
    private CommunicationPanel communicationPanel;
    private MailBoxPanelListener mailBoxPanelListener;

    public MainFrame() {
        setTitle("Main window");
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        initComps();
        layoutComps();
        activateFrame();
    }



    private void initComps() {
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu fileMenu = new JMenu("File Menu");
        JMenuItem save = new JMenuItem("save as...");
        JMenuItem open = new JMenuItem("open...");
        JMenuItem exit = new JMenuItem("exit");
        fileMenu.add(save);
        fileMenu.add(open);
        fileMenu.addSeparator();
        fileMenu.add(exit);
        menuBar.add(fileMenu);

        mailBoxPanel = new MailBoxPanel();
        communicationPanel = new CommunicationPanel();
    }

    private void layoutComps() {
        setLayout(new MigLayout("insets 5 20 15 20"));
        add(menuBar, "wrap");
        add(new JSeparator(), "w 100%, span, wrap, pad 0 0 10 0");
        add(mailBoxPanel, "w 45%, h 100%");
        add(communicationPanel, "w 45%, h 100%, align right");
    }

    private void activateFrame() {
        mailBoxPanelListener = new MailBoxPanelListener() {
            @Override
            public void addUserToMailbox(User user) {
                communicationPanel.updateMailbox(user);
            }
        };
        mailBoxPanel.setMailBoxPanelListener(mailBoxPanelListener);
    }

}
