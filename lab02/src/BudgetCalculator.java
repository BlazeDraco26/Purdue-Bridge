import java.util.Scanner;

/**
 * Purdue CS Bridge – Lab 02 (Using IntelliJ & Debugging)
 * BudgetCalculator.java
 * This calculator has a few bugs in it, go ahead and find them
 * and try to fix them.
 *
 * @author YOUR_NAME, YOUR_EMAIL
 * @version 01/01/1970
 */

public class BudgetCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter how much you make a month: $");
        double income = input.nextDouble();

        System.out.print("Please enter your rent per month: $");
        double rent = input.nextDouble();

        System.out.print("Please enter the total for your monthly bills: $");
        double bills = input.nextDouble();

        double leftover = income - rent - bills;
        System.out.format("You have $ %.2f leftover this month.\n", leftover);    }

}
