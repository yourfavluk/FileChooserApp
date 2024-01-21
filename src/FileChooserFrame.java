import javax.swing.*;
import java.awt.*;

public class FileChooserFrame extends JFrame {

    public FileChooserFrame() {
        setTitle("File Chooser App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FileSelectionPanel fileSelectionPanel = new FileSelectionPanel();
        getContentPane().add(fileSelectionPanel);

        setSize(400, 300);
        setLocationRelativeTo(null);
    }
}