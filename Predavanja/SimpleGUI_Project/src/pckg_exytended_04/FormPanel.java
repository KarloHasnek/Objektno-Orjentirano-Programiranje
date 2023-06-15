package pckg_exytended_04;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FormPanel extends JPanel {

    private JTextField nameField;
    private JTextField mailField;
    private JComboBox<String> experience;
    private JList<String> skills;
    private JCheckBox java;
    private JCheckBox python;
    private JCheckBox rust;
    private JRadioButton area1;
    private JRadioButton area2;
    private ButtonGroup areaGroup;
    private JButton submitButton;
    private JScrollPane skillsPane;
    private FormPanelListener formPanelListener;

    public FormPanel() {

        Dimension dims = getPreferredSize();
        dims.height = 250;
        setPreferredSize(dims);

        initComps();
        layoutComps();
        //activatePanel();

    }

    public void setFormPanelListener(FormPanelListener fpl){
        this.formPanelListener = fpl;
    }

    private void initComps(){

        Border innerBorder = BorderFactory.createTitledBorder("Form data");
        Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        Border border = BorderFactory.createCompoundBorder(outerBorder, innerBorder);
        setBorder(border);

        nameField = new JTextField(10);
        mailField = new JTextField(10);
        experience = new JComboBox<>(new String[] {"Beginner", "Intermediate", "Advanced"});
        experience.setPreferredSize(new Dimension(110,25));
        experience.setSelectedIndex(-1);
        skills = new JList<>(new String[] {"Communication", "Teamwork", "Learning", "Problem Solving", "Creativity"});
        skills.setVisibleRowCount(3);
        skills.setBorder(BorderFactory.createEtchedBorder());
        skillsPane = new JScrollPane(skills, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        java = new JCheckBox("Java");
        python = new JCheckBox("Python");
        rust = new JCheckBox("Rust");
        area1 = new JRadioButton("Area-1");
        area2 = new JRadioButton("Area-2");
        area1.setActionCommand("AREA-1");
        area2.setActionCommand("AREA-2");
        areaGroup = new ButtonGroup();
        areaGroup.add(area1);
        areaGroup.add(area2);
        areaGroup.setSelected(area1.getModel(), true);
        submitButton = new JButton("Submit");

    }

    private void layoutComps() {

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weighty = 0.1;
        gbc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(new JLabel("Name: "), gbc);

        gbc.gridy++;
        add(new JLabel("Mail: "), gbc);

        gbc.gridy++;
        add(new JLabel("Experience: "), gbc);

        gbc.gridy = 0;
        gbc.gridx++;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(nameField, gbc);

        gbc.gridy++;
        add(mailField, gbc);

        gbc.gridy++;
        add(experience, gbc);

        gbc.gridy = 0;
        gbc.gridx++;

        add(Box.createHorizontalStrut(10), gbc);
        gbc.gridx++;

        gbc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(new JLabel("Skill set: "), gbc);

        gbc.gridy++;
        gbc.gridx++;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(skillsPane, gbc);

        gbc.gridy++;
        gbc.gridx--;
        gbc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(new JLabel("Select area: "), gbc);

        gbc.gridy++;
        gbc.gridx++;
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(area1, gbc);

        gbc.gridy++;
        add(area2, gbc);

        gbc.gridy = 0;
        gbc.gridx++;
        gbc.anchor = GridBagConstraints.FIRST_LINE_END;
        add(new JLabel("Select language: "), gbc);

        gbc.gridy++;
        gbc.gridx++;
        gbc.anchor = GridBagConstraints.LAST_LINE_START;
        add(java, gbc);

        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.gridy++;
        add(python, gbc);

        gbc.gridy++;
        add(rust, gbc);

        gbc.gridy++;
        gbc.anchor = GridBagConstraints.CENTER;
        add(submitButton, gbc);

    }

    private ArrayList<String> getLangString() {
        ArrayList<String> lang = new ArrayList<>();
        if (java.isSelected()) {
            lang.add(java.getText());
        }
        if (python.isSelected()) {
            lang.add(python.getText());
        }
        if (rust.isSelected()) {
            lang.add(rust.getText());
        }

        return lang;
    }

    public void activatePanel() {
        if (formPanelListener != null){
            submitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String name = nameField.getText();
                    String mail = mailField.getText();
                    nameField.requestFocus();
                    String exp = (String) experience.getSelectedItem();
                    String skill = skills.getSelectedValue();
                    String[] lang = getLangString().toArray(new String[0]);
                    String area = areaGroup.getSelection().getActionCommand();
                    FormPanelEvent fpe = new FormPanelEvent(this, name, mail, exp, skill, lang, area);
                    formPanelListener.formPanelEventOccurred(fpe);
                    resetForm();
                }
            });
        }

    }

    private void resetForm(){
        nameField.setText("");
        mailField.setText("");
        experience.setSelectedIndex(-1);
        skills.clearSelection();
        areaGroup.setSelected(area1.getModel(), true);
        java.setSelected(false);
        python.setSelected(false);
        rust.setSelected(false);
    }
}
