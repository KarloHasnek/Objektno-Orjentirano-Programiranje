package pckg_extended_03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private JButton bntSubmit;
    private ViewPanel viewPanel;
    private ToolBar toolBar;
    private ToolBarListener toolBarListener;

    public MainFrame(){

        super("simple app-03");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        initializeAll();
        layoutComps();
        activateMainFrame();
    }

    private void initializeAll(){
        bntSubmit = new JButton("Submit");
        viewPanel = new ViewPanel();
        toolBar = new ToolBar();
    }

    private void layoutComps(){
        setLayout(new BorderLayout());
        add(viewPanel, BorderLayout.CENTER);
        add(bntSubmit, BorderLayout.SOUTH);
        add(toolBar, BorderLayout.NORTH);
    }

    private void activateMainFrame(){

        bntSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String msg = "Some message for text area!";
                viewPanel.setText2TxtArea(msg);
            }
        });

        toolBarListener = new ToolBarListener() {

            @Override
            public void clearAllFromViewPanel() {
                viewPanel.clearAll4TextArea();
            }

            @Override
            public void setFileContent2Panel(String cont) {
                viewPanel.setText2TxtArea(cont);
            }
        };
        toolBar.setToolBarListener(toolBarListener);
    }
}
