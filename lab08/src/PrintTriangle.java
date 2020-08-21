/**
 * Purdue CS Bridge - Lab 08 (Repetition Challenge)
 * PrintTriangle.java
 * This will print a right triangle where the size is based on user input.
 *
 * @author YOUR_NAME, YOUR_EMAIL
 * @version 01/01/1970
 */
import java.util.Scanner;
public class PrintTriangle {

    /**
     * Prints a triangle where the size is based on user input. Can repeat this
     * process as many times as the user wishes.
     * @param args an array of string arguments
     */
    public static void main(String[] args) {
        int number = 0;
        String triangle = "";
        Scanner scanner = new Scanner(System.in);
        do {
            do {
                System.out.println("Please type a number:");
                number = scanner.nextInt();
                if (number < 1) {
                    System.out.println("Invalid Number.");
                }
            } while (number < 1);
            for (int i = 0; i < number; i++) {
                System.out.println("*".repeat(i + 1));
            }
            while (true) {
                System.out.println("Please select an option:\n1 - Continue | 2 - End");
                number = scanner.nextInt();
                if (number == 1 || number == 2) {
                    break;
                }
            }
        } while (number == 1);
        System.out.println("Terminating...");


        //TODO: Implement method
    }

}
