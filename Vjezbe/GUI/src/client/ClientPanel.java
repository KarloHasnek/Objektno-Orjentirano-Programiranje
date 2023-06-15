package client;

import javax.swing.*;
import java.awt.*;

public class ClientPanel extends JPanel {

    private JMenuBar menuBar;

    public ClientPanel() {

        initComps();
        layoutComps();
        activateComps();
    }

    private void initComps() {
        menuBar = createJMenuBar();
    }

    private void layoutComps() {
        setLayout(new BorderLayout());
        add(menuBar, BorderLayout.NORTH);
    }

    private void activateComps() {

    }

    private JMenuBar createJMenuBar(){

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");

        JMenuItem saveDataItem = new JMenuItem("Save as...");
        JMenuItem openDataItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");

        //menuBar.add(Box.createHorizontalGlue());
        fileMenu.add(saveDataItem);
        fileMenu.add(openDataItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        return menuBar;
    }
}
