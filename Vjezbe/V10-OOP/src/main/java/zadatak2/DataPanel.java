package zadatak2;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;

public class DataPanel extends JPanel {

    private JTextField payment;
    private JTextArea textArea;
    private JScrollPane scrollPane;


    public DataPanel() {

        setPreferredSize(new Dimension(MainFrame.WIDTH/2, MainFrame.HEIGHT));
        setFont(new Font("Monospaced", Font.BOLD, 16));
        initComps();
        layoutComps();
    }

    private void initComps() {

        Dimension dims = getPreferredSize();

        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setBorder(BorderFactory.createLineBorder(Color.lightGray));
        textArea.setLineWrap(true);
        textArea.setFont(getFont());

        payment = new JTextField();
        payment.setEditable(false);
        payment.setPreferredSize(new Dimension(dims.width, 45));
        payment.setFont(getFont());
        payment.setBorder(BorderFactory.createLineBorder(Color.lightGray));
        scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBar(null);
        scrollPane.setWheelScrollingEnabled(true);
    }

    private void layoutComps() {
        setLayout(new BorderLayout(3,3));
        add(scrollPane, BorderLayout.CENTER);
        add(payment, BorderLayout.SOUTH);
    }

    public void setData(String text) {

        textArea.append("////////////CALCULATION////////////\n");
        textArea.append(text+"\n");
    }

    public void setRata(double total){
        payment.setText("Rata kredita: " + total);
    }
}
