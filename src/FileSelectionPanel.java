import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class FileSelectionPanel extends JPanel {

    private JTextField filePathTextField;

    public FileSelectionPanel() {
        JLabel label = new JLabel("Selected File:");
        filePathTextField = new JTextField(20);
        JButton openButton = new JButton("Open File");

        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openFile();
            }
        });

        add(label);
        add(filePathTextField);
        add(openButton);
    }

    private void openFile() {
        JFileChooser fileChooser = new JFileChooser();

        int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            filePathTextField.setText(selectedFile.getAbsolutePath());
            FileHandler.handleFile(selectedFile);
        }
    }
}
