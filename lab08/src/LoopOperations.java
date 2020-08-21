import java.util.Scanner;

/**
 * Purdue CS Bridge - Lab 08 (Repetition Challenge)
 * LoopOperations.java
 * Perform debugging on functions that are not functioning correctly.
 *
 * @author YOUR_NAME, YOUR_EMAIL
 * @version 01/01/1970
 */
public class LoopOperations {

    /**
     * Prints all positive odd numbers up to, and including, a specified number.
     * @param n an int that specifies the max range
     */
    public static void printOddNumbers(int n) {
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    /**
     * Prints all letters of the alphabet in lowercase first then in uppercase where both are on different lines.
     */
    public static void printAlphabet() {
        char c;

        for (c = 'a'; c <= 'z'; c++) {
            System.out.print(c);
        }

        System.out.println();

        for (c = 'A'; c <= 'Z'; c++) {
            System.out.print(c);
        }
    }

    /**
     * Returns the product of all digits in the input.
     * @param num a string that only contains numbers
     * @return the product of all digits in the input
     */
    public static int productOfDigits(String num) {
        if (num.length() == 0) {
            return 0;
        }

        char ch;
        int product = 1;

        for (int i = 0; i < num.length(); i++) {
            ch = num.charAt(i);
            product *= Integer.parseInt(Character.toString(ch));
        }

        return product;
    }

    //====================================================================================//
    // Note: Do not touch anything below this comment; all bugs are in the methods above.
    //====================================================================================//

    public static final String exampleString = "52625146";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select an option:");
        System.out.println("1 - printOddNumbers() | 2 - printAlphabet() | 3 - productOfDigits()");

        int choice = sc.nextInt();
        int upperBound;

        switch (choice) {
            case 1:
                System.out.println("printOddNumbers - Enter the upper bound:");
                upperBound = sc.nextInt();
                printOddNumbers(upperBound);
                break;
            case 2:
                printAlphabet();
                break;
            case 3:
                System.out.printf("productOfDigits - The value returned is %d\n",productOfDigits(exampleString));
                break;
        }
    }

}
