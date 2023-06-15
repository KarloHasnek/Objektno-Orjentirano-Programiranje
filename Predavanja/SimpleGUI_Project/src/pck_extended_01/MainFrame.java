package pck_extended_01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private JButton bntSubmit;
    private ViewPanel viewPanel;

    public MainFrame(){

        super("simple app-01");
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
    }

    private void layoutComps(){
        setLayout(new BorderLayout());
        add(viewPanel, BorderLayout.CENTER);
        add(bntSubmit, BorderLayout.SOUTH);
    }

    private void activateMainFrame(){
        bntSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String msg = "Some message for text area!";
                viewPanel.setText2TxtArea(msg);
            }
        });
    }
}
