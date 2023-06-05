import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.*;

public class MainFrame extends JFrame {

    private ViewPanel viewPanel;
    private BottomPanel bottomPanel;
    private ToolbarPanel toolbarPanel;
    private JFileChooser fileChooser;

    public MainFrame(){
        super("Simple GUI app");
        setSize(800, 600);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        initComps();
        layoutComps();
        activateApp();
    }

    private void initComps() {
        viewPanel = new ViewPanel();
        bottomPanel = new BottomPanel();
        toolbarPanel = new ToolbarPanel();
        fileChooser = new JFileChooser();
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("TXT Files", "txt"));
    }

    private void layoutComps() {
        setLayout(new BorderLayout());
        add(viewPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
        add(toolbarPanel, BorderLayout.NORTH);
    }

    private void activateApp(){
        bottomPanel.setBottomPanelListener(new BottomPanelListener() {
            @Override
            public void bottomPanelEventOccurred(BottomPanelEvent bpe) {
                String name = bpe.getName();
                String surname = bpe.getSurname();
                String programmingLanguage = bpe.getProgrammingLanguage();
                viewPanel.setTextOnTextArea(name + " " + surname + " -> " + programmingLanguage + "\n");
            }
        });

        bottomPanel.activateComps();

        toolbarPanel.setToolbarListener(new ToolbarListener() {
            @Override
            public void clearButtonEventOccured(ToolbarEvent tbe) {
                viewPanel.clearAll();
            }

            @Override
            public void readFromFileEventOccured(ToolbarEvent tbe) {
                int val = fileChooser.showOpenDialog(MainFrame.this);
                if (val == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    try (BufferedReader br = new BufferedReader(new FileReader(file))){
                        String line;
                        while ((line=br.readLine())!= null){
                            viewPanel.setTextOnTextArea(line + "\n");
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                }
            }
        });

        toolbarPanel.activateToolbar();
    }
}
