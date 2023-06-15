package pckg_extended_02;

import javax.print.attribute.standard.JobName;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class ToolBar extends JPanel implements ActionListener {

    private JButton clrBtn;
    private JButton readFleBtn;
    private ViewPanel viewPanel;

    public ToolBar(){
        clrBtn = new JButton("Clear all");
        readFleBtn = new JButton("Read from file...");
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(clrBtn);
        add(readFleBtn);
        activateToolBar();
    }

    private void activateToolBar(){
        clrBtn.addActionListener(this);
        readFleBtn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ev) {

        if(ev.getSource()==clrBtn){
            System.out.println("Clear all from text area!");
            viewPanel.clearAll4TextArea();
        } else if (ev.getSource()==readFleBtn){
            System.out.println("Reading from some file!");
            JFileChooser fileChooser = new JFileChooser();
            int val = fileChooser.showOpenDialog(this);
            if(val == JFileChooser.APPROVE_OPTION){
                File file = fileChooser.getSelectedFile();
                try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)))){
                    String line = null;
                    StringBuilder sb = new StringBuilder();
                    while((line = br.readLine())!=null){
                        sb.append(line).append("\n");
                    }
                    viewPanel.setText2TxtArea(sb.toString());
                }catch(IOException ioe){
                    ioe.printStackTrace();
                }
            }
        } else {
            System.out.println(ev.toString());
        }

    }


    public void setViewPanel(ViewPanel vp){
        this.viewPanel = vp;
    }
}
