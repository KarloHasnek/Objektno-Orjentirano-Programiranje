package pckg_exytended_04;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class MainFrame extends JFrame {

    private FormPanel formPanel;
    private ViewPanel viewPanel;
    //private ToolBar toolBar;
    //private ToolBarListener toolBarListener;
    private JMenuBar menuBar;
    private JMenuItem saveDataItem;
    private JMenuItem openDataItem;
    private JMenuItem exitItem;
    private JFileChooser fileChooser;
    private ArrayList<Programmer> programmers;

    public MainFrame(){

        super("simple app-04");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        initializeAll();
        layoutComps();
        activateMainFrame();
    }

    private void initializeAll(){
        formPanel = new FormPanel();
        viewPanel = new ViewPanel();
        //toolBar = new ToolBar();
        menuBar = createJMenuBar();
        setJMenuBar(menuBar);
        programmers = new ArrayList<>();
    }

    private void layoutComps(){
        setLayout(new BorderLayout());
        add(viewPanel, BorderLayout.CENTER);
        add(formPanel, BorderLayout.SOUTH);
        //add(toolBar, BorderLayout.NORTH);
    }

    private void activateMainFrame() {

//        toolBarListener = new ToolBarListener() {
//
//            @Override
//            public void clearAllFromViewPanel() {
//                viewPanel.clearAll4TextArea();
//            }
//
//            @Override
//            public void setFileContent2Panel(String cont) {
//                viewPanel.setText2TxtArea(cont);
//            }
//
//            @Override
//            public String getContent4TextArea() {
//                return viewPanel.getAll();
//            }
//        };
//        toolBar.setToolBarListener(toolBarListener);

        formPanel.setFormPanelListener(new FormPanelListener() {
            @Override
            public void formPanelEventOccurred (FormPanelEvent formEvent){

                System.out.println(formEvent);

                Programmer programmer = new Programmer(formEvent.getName(), formEvent.getMail(),
                        formEvent.getExperience(), formEvent.getSkills(),
                        formEvent.getLanguages(), formEvent.getArea());

                programmers.add(programmer);
                viewPanel.listAllProgrammers(programmers);
                //viewPanel.setText2TxtArea(formEvent.toString());
            }
        });
        formPanel.activatePanel();

        saveDataItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fileChooser = new JFileChooser();
                fileChooser.addChoosableFileFilter(new FileNameExtensionFilter(".bin file", "bin"));
                fileChooser.setAcceptAllFileFilterUsed(true);
                fileChooser.setSelectedFile(new File("programmers.bin"));

                int returnVal = fileChooser.showSaveDialog(MainFrame.this);
                if (returnVal == JFileChooser.APPROVE_OPTION && fileChooser.getSelectedFile().getName().endsWith(".bin")) {
                    save2File(fileChooser.getSelectedFile(), programmers);
                } else {
                    JOptionPane.showMessageDialog(MainFrame.this, "ERROR: File not saved", "File not saved", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        openDataItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fileChooser = new JFileChooser();
                fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("bin file", "bin"));
                fileChooser.setAcceptAllFileFilterUsed(false);

                int returnVal = fileChooser.showSaveDialog(MainFrame.this);
                if (returnVal == JFileChooser.APPROVE_OPTION && fileChooser.getSelectedFile().getName().endsWith(".bin")) {
                    System.out.println(fileChooser.getSelectedFile().getName());
                }
            }
        });

        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int action = JOptionPane.showConfirmDialog(MainFrame.this, "Do you really want to exit the application?", "Confirm exit", JOptionPane.OK_CANCEL_OPTION);
                if (action == JOptionPane.OK_OPTION) {
                    System.exit(0);
                } else {
                    JOptionPane.showMessageDialog(MainFrame.this, "Exit cancelled", "Exit cancelled", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }

    private void save2File(File file, ArrayList<Programmer> programmers){
        try (ObjectOutputStream os = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
            os.writeObject(programmers);
            JOptionPane.showMessageDialog(MainFrame.this, "Data saved successfully", "Data saved", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(MainFrame.this, "Could not save data to file", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    private JMenuBar createJMenuBar(){

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");

        saveDataItem = new JMenuItem("Save as...");
        openDataItem = new JMenuItem("Open");
        exitItem = new JMenuItem("Exit");

        fileMenu.add(saveDataItem);
        fileMenu.add(openDataItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        return menuBar;
    }
}
