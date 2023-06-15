package pckg_exytended_04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class ToolBar extends JPanel implements ActionListener {

    private JButton clrBtn;
    private JButton readFleBtn;
    private ToolBarListener tbL;
    private JButton saveBtn;

    public ToolBar(){
        clrBtn = new JButton("Clear all");
        readFleBtn = new JButton("Read from file...");
        saveBtn = new JButton("Save to file...");
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(clrBtn);
        add(readFleBtn);
        add(saveBtn);
        activateToolBar();
    }

    private void activateToolBar(){
        clrBtn.addActionListener(this);
        readFleBtn.addActionListener(this);
        saveBtn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        JFileChooser fileChooser = new JFileChooser();
        if(ev.getSource()==clrBtn){
            System.out.println("Clear all from text area!");
            tbL.clearAllFromViewPanel();
        } else if (ev.getSource()==readFleBtn){
            System.out.println("Reading from some file!");
            int val = fileChooser.showOpenDialog(this);
            if(val == JFileChooser.APPROVE_OPTION){
                File file = fileChooser.getSelectedFile();
                try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)))){
                    String line = null;
                    StringBuilder sb = new StringBuilder();
                    while((line = br.readLine())!=null){
                        sb.append(line).append("\n");
                    }
                    tbL.setFileContent2Panel(sb.toString());
                }catch(IOException ioe){
                    ioe.printStackTrace();
                }
            }
        } else if(ev.getSource()==saveBtn){
            System.out.println("Saving to the file!!!");
            int val = fileChooser.showSaveDialog(this);
            if(val == JFileChooser.APPROVE_OPTION){
                File file = fileChooser.getSelectedFile();
                try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
                    String content = tbL.getContent4TextArea();
                    bw.write(content);
                }catch (IOException ioe){
                    ioe.printStackTrace();
                }
            }

        } else {
            System.out.println(ev.toString());
        }

    }


    public void setToolBarListener(ToolBarListener lst){
        this.tbL = lst;
    }
}
