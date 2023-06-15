package pckg_exytended_04;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ViewPanel extends JPanel {

    private JTextArea txtArea;
    private JScrollPane scPane;

    public ViewPanel(){
        txtArea = new JTextArea();
        scPane = new JScrollPane(txtArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        setLayout(new BorderLayout());
        add(scPane,BorderLayout.CENTER);
    }

    public void setText2TxtArea(String text){
        txtArea.append(text + "\n");
    }

    public void clearAll4TextArea() {

        txtArea.selectAll();
        txtArea.replaceSelection(null);
    }

    public String getAll() {
        txtArea.selectAll();
        return txtArea.getSelectedText();
    }

    public void listAllProgrammers(ArrayList<Programmer> programmers){
        clearAll4TextArea();
        for (Programmer programmer : programmers) {
            setText2TxtArea(programmer.toString());
        }
    }
}
