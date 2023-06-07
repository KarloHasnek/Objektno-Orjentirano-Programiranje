package frames;

import javax.swing.*;

public class PopupFrame extends JFrame {

    private JButton button;

    public PopupFrame() {
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        initComps();
        layoutComps();
    }

    private void initComps(){
        button = new JButton();
    }

    private void layoutComps(){
        add(button);
        button.setText("OK");
        pack();
    }
}
