package lab15;

import java.awt.Component;
import java.util.Random;
import java.util.Scanner;
import javax.swing.Icon;

/**
 * Purdue CS Bridge - Lab 15 (Graphical User Interfaces)
 * JOptionPane.java
 *
 * JOptionPane docs:
 * https://docs.oracle.com/javase/10/docs/api/javax/swing/JOptionPane.html
 *
 * @author YOUR_NAME, YOUR_EMAIL
 * @version 01/01/1970
 */
public class JOptionPane {

    public static int ERROR_MESSAGE = javax.swing.JOptionPane.ERROR_MESSAGE;
    public static int INFORMATION_MESSAGE = javax.swing.JOptionPane.INFORMATION_MESSAGE;
    public static int WARNING_MESSAGE = javax.swing.JOptionPane.WARNING_MESSAGE;
    public static int QUESTION_MESSAGE = javax.swing.JOptionPane.QUESTION_MESSAGE;
    public static int PLAIN_MESSAGE = javax.swing.JOptionPane.PLAIN_MESSAGE;

    public static int DEFAULT_OPTION = javax.swing.JOptionPane.DEFAULT_OPTION;
    public static int YES_NO_OPTION = javax.swing.JOptionPane.YES_NO_OPTION;
    public static int YES_NO_CANCEL_OPTION = javax.swing.JOptionPane.YES_NO_CANCEL_OPTION;
    public static int OK_CANCEL_OPTION = javax.swing.JOptionPane.OK_CANCEL_OPTION;

    public static int YES_OPTION = javax.swing.JOptionPane.YES_OPTION;
    public static int NO_OPTION = javax.swing.JOptionPane.NO_OPTION;
    public static int OK_OPTION = javax.swing.JOptionPane.OK_OPTION;
    public static int CANCEL_OPTION = javax.swing.JOptionPane.CANCEL_OPTION;
    public static int CLOSED_OPTION = javax.swing.JOptionPane.CLOSED_OPTION;

    /**
     * Printed to stdout with each method call to help ensure that students are calling the methods.
     */
    private static long secret = (new Random()).nextLong();

    /**
     * When testing, stdin and stdout are used. Otherwise, real JOptionPane is used.
     */
    private static boolean isTesting = false;

    /**
     * Read from stdin.
     */
    private static Scanner scan;

    /**
     * Used so that the student code and the solution code make the same decisions
     */
    public static Random random = new Random(secret);

    /**
     * This method should only be called by the test framework.
     */
    public static void setIsTesting() {
        isTesting = true;
    }

    /**
     * Resets the scanner and the random number generator.
     *
     * The scanner must be reset every time System.in is updated.
     * Random must be reset before calling the main program.
     * Both of these are usually done are the same time.
     */
    public static void setScannerAndRandom() {
        if (scan != null) {
            scan.close();
        }

        scan = new Scanner(System.in);
        random = new Random(secret);
    }

    /**
     * Print descriptions of the objects.
     *
     * @param objects a sequence of objects
     */
    private static void print(Object... objects) {
        for (Object object : objects) {
            if (object != null) {
                System.out.println(object.toString());
            } else {
                System.out.println("null");
            }
        }
    }

    public static int showConfirmDialog(Component parentComponent, Object message) {
        return showConfirmDialog(parentComponent, message, null, DEFAULT_OPTION, PLAIN_MESSAGE);
    }

    public static int showConfirmDialog(Component parentComponent, Object message, String title, int optionType, int messageType) {
        return showConfirmDialog(parentComponent, message, title, optionType, messageType, null);
    }

    public static int showConfirmDialog(Component parentComponent, Object message, String title, int optionType, int messageType, Icon icon) {
        if (isTesting) {
            print(secret, parentComponent, message, title, optionType, messageType, icon);
            return Integer.parseInt(scan.nextLine());
        } else {
            return javax.swing.JOptionPane.showConfirmDialog(parentComponent, message, title, optionType, messageType);
        }
    }

    public static String showInputDialog(Component parentComponent, Object message) {
        return showInputDialog(parentComponent, message, null);
    }

    public static String showInputDialog(Component parentComponent, Object message, Object initialSelectionValue) {
        return (String) showInputDialog(parentComponent, message, null, PLAIN_MESSAGE, null, null, initialSelectionValue);
    }

    public static String showInputDialog(Component parentComponent, Object message, String title, int messageType) {
        return (String) showInputDialog(parentComponent, message, title, messageType, null, null, null);
    }

    public static Object showInputDialog(Component parentComponent, Object message, String title, int messageType, Icon icon, Object[] selectionValues, Object initialSelectionValue) {
        if (isTesting) {
            print(secret, parentComponent, message, title, messageType, icon);

            for (Object selectionValue : selectionValues) {
                print(selectionValue);
            }

            print(initialSelectionValue);

            final String line = scan.nextLine();

            if (line.equals("null")) {
                return null;
            } else {
                return line;
            }
        } else {
            return javax.swing.JOptionPane.showInputDialog(parentComponent, message, title, messageType, icon, selectionValues, initialSelectionValue);
        }
    }

    public static String showInputDialog(Object message) {
        return showInputDialog(null, message);
    }

    public static String showInputDialog(Object message, Object initialSelectionValue) {
        return showInputDialog(null, message, initialSelectionValue);
    }

    public static void showMessageDialog(Component parentComponent, Object message) {
        showMessageDialog(parentComponent, message, null, PLAIN_MESSAGE);
    }

    public static void showMessageDialog(Component parentComponent, Object message, String title, int messageType) {
        showMessageDialog(parentComponent, message, title, messageType, null);
    }

    public static void showMessageDialog(Component parentComponent, Object message, String title, int messageType, Icon icon) {
        if (isTesting) {
            print(secret, parentComponent, message, title, messageType, icon);
        } else {
            javax.swing.JOptionPane.showMessageDialog(parentComponent, message, title, messageType, icon);
        }
    }

    public static int showOptionDialog(Component parentComponent, Object message, String title, int optionType, int messageType, Icon icon, Object[] options, Object initialValue) {
        if (isTesting) {
            print(secret, parentComponent, message, title, optionType, messageType, icon);

            for (Object option : options) {
                print(option);
            }

            print(initialValue);

            return Integer.parseInt(scan.nextLine());
        } else {
            return javax.swing.JOptionPane.showOptionDialog(parentComponent, message, title, optionType, messageType, icon, options, initialValue);
        }
    }

}
