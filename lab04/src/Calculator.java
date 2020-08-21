import java.util.Scanner;

/**
 * Purdue CS Bridge – Lab 04 (Strings Challenge)
 * Calculator.java
 * Debug several methods involving `String` parsing.
 *
 * @author YOUR_NAME, YOUR_EMAIL
 * @version 01/01/1970
 */
public class Calculator {

    /**
     * Returns the sum of two numbers passed in as `Strings`s.
     * @param s1 any whole number
     * @param s2 any whole number
     * @return the sum of the two numbers
     */
    private static int add(String s1, String s2) {
        int sum = Integer.parseInt(s1) + Integer.parseInt(s2);
        return sum;
    }

    /**
     * Returns the difference of two numbers passed in as `int`s.
     * @param s1 any whole number
     * @param s2 any whole number
     * @return the difference of the two numbers
     */
    private static int subtract(int s1, int s2) {
        int difference = s1 - s2;
        return difference;
    }

    /**
     * Returns the product of two numbers passed in as `String`s.
     * @param s1 any whole number
     * @param s2 any whole number
     * @return the product of the two numbers
     */
    private static int multiply(String s1, String s2) {
        int product = Integer.parseInt(s1) * Integer.parseInt(s2);
        return product;
    }

    /**
     * Returns the quotient of two numbers passed in as `String`s.
     * @param s1 any whole number
     * @param s2 any whole number
     * @return the quotient of the two numbers
     */
    private static double divide(String s1, String s2) {
        double result = Double.parseDouble(s1) / Double.parseDouble(s2);
        return result;
    }

    /**
     * Returns a `String` containing the quotient and remainder two numbers passed in as `String`s.
     * @param s1 any whole number
     * @param s2 any whole number
     * @return the quotient and remainder of two numbers
     */
    private static String remainder(String s1, String s2) {
        int leftover = Integer.parseInt(s1) % Integer.parseInt(s2);
        int quotient = Integer.parseInt(s1) / Integer.parseInt(s2);
        String value = quotient + ", remainder " + leftover;
        return value;
    }

    /* NOTE: Do not modify anything below this line; all the bugs are in the methods above. */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please select an option:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Division with remainder");
        int choice = input.nextInt();
        input.nextLine();
        String str1;
        String str2;
        int int1;
        int int2;
        switch(choice) {
            case 1:
                System.out.println("Add: Enter the first number");
                str1 = input.nextLine();
                System.out.printf("Add: Your first number is: %s, enter the second number\n", str1);
                str2 = input.nextLine();
                System.out.printf("%s + %s is: %d", str1, str2, add(str1, str2));
                break;
            case 2:
                System.out.println("Subtract: Enter the first number");
                int1 = input.nextInt(); input.nextLine();
                System.out.printf("Subtract: Your first number is: %s, enter the second number\n", int1);
                int2 = input.nextInt(); input.nextLine();
                System.out.printf("%s - %s is: %d", int1, int2, subtract(int1, int2));
                break;
            case 3:
                System.out.println("Multiply: Enter the first number");
                str1 = input.nextLine();
                System.out.printf("Multiply: Your first number is: %s, enter the second number\n", str1);
                str2 = input.nextLine();
                System.out.printf("%s multiplied by %s is: %d", str1, str2, multiply(str1, str2));
                break;
            case 4:
                System.out.println("Divide: Enter the first number");
                str1 = input.nextLine();
                System.out.printf("Divide: Your first number is: %s, enter the second number\n", str1);
                str2 = input.nextLine();
                System.out.printf("%s divided %s is: %f", str1, str2, divide(str1, str2));
                break;
            case 5:
                System.out.println("Divide w/ Remainder: Enter the first number");
                str1 = input.nextLine();
                System.out.printf("Divide w/ Remainder: Your first number is: %s, enter the second number\n", str1);
                str2 = input.nextLine();
                System.out.printf("%s divided by %s is: %s", str1, str2, remainder(str1, str2));
                break;
            default:
                System.out.println("Please enter a valid option");
        }
    }
}
