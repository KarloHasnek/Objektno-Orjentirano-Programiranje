package zadatak2;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import javax.swing.text.GapContent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class FormPanel extends JPanel implements ActionListener {

        private JTextField kredit;
        private JTextField godina;
        private JComboBox<String> comboBox;
        private JRadioButton radioButton1;
        private JRadioButton radioButton2;
        private JButton prikaz;
        private JButton izracunaj;
        private DefaultComboBoxModel<String> comboBoxModel;
        private ButtonGroup radioGroup;
        private FormListener formPanelListener;

    public FormPanel() {

        setPreferredSize(new Dimension(MainFrame.WIDTH/2, MainFrame.HEIGHT));
        initComps();
        layoutComps();
        activateFrame();
    }
    private void initComps() {

        kredit = new JTextField();
        godina = new JTextField();
        comboBox = new JComboBox<>();
        radioButton1 = new JRadioButton("Mjesecno placanje");
        radioButton2 = new JRadioButton("Kvartalno placanje");
        prikaz = new JButton("Prikaz");
        izracunaj = new JButton("Izracunaj");
        comboBoxModel = new DefaultComboBoxModel<>();
        radioGroup = new ButtonGroup();
        radioGroup.add(radioButton1);
        radioGroup.add(radioButton2);
        radioButton1.setSelected(true);

        String[] arrStope = {"5%", "6%", "7%", "8%", "9%", "10%", "11%"};
        comboBox.setModel(comboBoxModel);
        comboBoxModel.addAll(List.of(arrStope));
        comboBox.setSelectedIndex(-1);
    }
    private void layoutComps() {

        setLayout(new MigLayout("insets 40 40 40 10", "[]20[]20[]", "[]20[]20[]"));
        add(new JLabel("Iznos kredita:"), "cell 0 0, align right");
        add(kredit, "cell 1 0, growx");
        add(new JLabel("Godina otplate:"), "cell 0 1");
        add(godina, "cell 1 1, wrap, gapbottom 40, growx");
        add(new JLabel("KAMATNA STOPA"), "cell 1 2, align center, wrap");
        add(comboBox, "cell 1 3, align center, wrap, gapbottom 40");
        add(radioButton1, "cell 1 4, wrap");
        add(radioButton2, "cell 1 5, wrap, gapbottom 200");
        add(prikaz, "cell 0 6, align center, growx");
        add(izracunaj, "cell 2 6, align center");
    }

    private void activateFrame() {
        prikaz.addActionListener(this);
        izracunaj.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (kredit.getText().isEmpty() || godina.getText().isEmpty() || comboBox.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(this, "Niste unijeli sve podatke!", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            Float.parseFloat(kredit.getText());
            Integer.parseInt(godina.getText());
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Kredit i Godina moraju biti broj!", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String kamataString = (String) comboBox.getSelectedItem();
        float kredit = Float.parseFloat(this.kredit.getText());
        float kamata = Float.parseFloat(kamataString.replaceAll("[^0-9]", ""));
        int godina = Integer.parseInt(this.godina.getText());
        boolean nacin = radioButton1.isSelected();

        if (e.getSource() == prikaz){
            formPanelListener.prikazText(new Calculation(kredit, kamata, godina, nacin).toString());
        } else if (e.getSource() == izracunaj){
            formPanelListener.izracunajKredit(Calculation.calculate(kredit, kamata, godina, nacin));
        }
    }

    public void setFormPanelListener(FormListener formPanelListener) {
        this.formPanelListener = formPanelListener;
    }
}
