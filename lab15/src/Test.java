import javax.swing.JOptionPane;

public class Test {

    public static void main(String[] args) {
        // JOptionPane.showConfirmDialog(null, "Let's go");
        // JOptionPane.showInputDialog("Bruh");
        // JOptionPane.showMessageDialog(null, "Hello world.");
        int choice = JOptionPane.showOptionDialog(null, "Message", "Title", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,
                null, null, null);

    }
}

