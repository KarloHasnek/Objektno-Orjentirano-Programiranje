package zadatak1;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private JPanel left;
    private JPanel right;
    private JTextField textFld;
    private JButton btn;
    private JTextArea area;
    private JScrollPane scp;
    private JButton resetBtn;


    public MainFrame(){

        super("Zadatak 1");
        setSize(500, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        initLeft();
        layoutLeft();

        initRight();
        layoutRight();

        // za postavljanje lijevog i desnog panela na MainFrame
        // MainFrame koristi BorderLayout
        layoutAll();

        activateFrame();
    }

    private void initRight(){
        right = new JPanel();
        area = new JTextArea();
        area.setEditable(false);
        area.setBackground(Color.lightGray);
        area.setForeground(Color.black);
        area.setFont(new Font("Andalus", Font.PLAIN, 16));
        scp = new JScrollPane(area);
        scp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scp.setWheelScrollingEnabled(true);
    }

    private void layoutRight(){
        right.setLayout(new BorderLayout());
        right.add(scp);
    }

    private void initLeft(){
        left = new JPanel();
        left.setBackground(new Color(122, 122, 122));
        Dimension dims = getPreferredSize();
        dims.width = 150;
        left.setPreferredSize(dims);
        textFld = new JTextField(10);
        btn = new JButton("Submit text");
        resetBtn = new JButton("Reset");
    }


    private void layoutLeft(){

        left.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // label for text field
        gbc.gridy = 0;
        gbc.gridx = 0;
        left.add(new JLabel("Enter text:"), gbc);

        // Ovaj dio koda ne radi for some reason

//       JLabel label = new JLabel("Enter text:");
//       label.setIconTextGap(5);
//       left.add(label, gbc);

        // now field
        gbc.gridy++;
        left.add(textFld, gbc);


        // empty row
        gbc.gridy++;
        Component bx = Box.createVerticalStrut(30);
        left.add(bx, gbc);

        // now button
        gbc.gridy++;
        gbc.weighty = 0.45;
        left.add(btn, gbc);

        // now reset button
        gbc.gridy++;
        left.add(resetBtn, gbc);
    }

    private void layoutAll(){
        setLayout(new BorderLayout());
        // lijevi dodati u WEST
        add(left, BorderLayout.WEST);

        // desni dodati u CENTER
        add(right, BorderLayout.CENTER);
    }

    private void activateFrame(){

        // za btn Submit text
        btn.addActionListener(e -> {
            if (textFld.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Text field is empty!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            area.append(textFld.getText() + "\n");
            textFld.setText("");
        });



        // za bnt Reset
        resetBtn.addActionListener(e -> {
            area.setText("");
        });
    }

}

