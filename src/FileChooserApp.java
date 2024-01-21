import javax.swing.*;

public class FileChooserApp {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new FileChooserFrame().setVisible(true);
        });
    }
}