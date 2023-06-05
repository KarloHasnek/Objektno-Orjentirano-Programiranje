import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolbarPanel extends JPanel {

    private JButton clearButton;
    private JButton readFileButton;
    private ToolbarListener toolbarListener;

    public ToolbarPanel(){
        initComps();
        layoutComps();
    }

    private void initComps() {
        clearButton = new JButton("Clear all");
        readFileButton = new JButton("Read from file");

    }

    private void layoutComps() {
        add(clearButton);
        add(readFileButton);
    }

    public void setToolbarListener(ToolbarListener toolbarListener) {
        this.toolbarListener = toolbarListener;
    }

    public void activateToolbar() {

        if (toolbarListener != null) {

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ToolbarEvent tbe = new ToolbarEvent(this);
                tbe.setClearClicked(true);
                toolbarListener.clearButtonEventOccured(tbe);
            }
        });

        readFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ToolbarEvent tbe = new ToolbarEvent(this);
                tbe.setReadClicked(true);
                tbe.setClearClicked(false);
                toolbarListener.readFromFileEventOccured(tbe);
            }
        });
        }
        }
    }
