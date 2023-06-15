package zadatak2;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private DataPanel dataPanel;
    private FormPanel formPanel;
    private FormListener formPanelListener;

    public static final int WIDTH = 800;
    public static final int HEIGHT = 650;

    public MainFrame() {

        super("Kalkulator kredita");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        setVisible(true);

        initComps();
        layoutComps();
        activateFrame();

    }

    private void initComps() {

        dataPanel = new DataPanel();
        dataPanel.setBorder(BorderFactory.createLineBorder(Color.lightGray));

        formPanel = new FormPanel();
        formPanel.setBorder(BorderFactory.createLineBorder(Color.lightGray));

    }

    private void layoutComps() {

        setLayout(new MigLayout("", "[grow, fill][grow, fill]", "[grow, fill]"));
        add(dataPanel, "east");
        add(formPanel, "west");

    }


    private void activateFrame() {
        formPanelListener = new FormListener() {
            @Override
            public void prikazText(String text) {
                dataPanel.setData(text);
            }

            @Override
            public void izracunajKredit(double total) {
                dataPanel.setRata(total);
            }
        };
        formPanel.setFormPanelListener(formPanelListener);
    }


}
