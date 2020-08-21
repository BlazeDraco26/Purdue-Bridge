import java.util.Scanner;

/* Purdue CS Bridge – Lab 03 (Strings and Primitives)
 * UsernameGenerator.java
 * This program asks users to input their name and age, then generates a username based off the input.
 *
 * @author YOUR_NAME, YOUR_EMAIL
 * @version 01/01/1970
 */
public class UsernameGenerator {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Please enter your full name: ");
        String name = s.nextLine();

        String firstName = name.substring(0, name.indexOf(" "));
        String lastName = name.substring(name.indexOf(" ") + 1);

        System.out.print("What year is it? ");
        String currentYear = s.nextLine();
        int userYear = Integer.parseInt(currentYear);

        System.out.print("How old will you turn this year? ");
        String age = s.nextLine();
        int userAge = Integer.parseInt(age);

        System.out.print("Your new username is " + firstName.toLowerCase().charAt(0) +
                lastName.toLowerCase() + (userYear - userAge) + ". Welcome to Purdue!");

        // TODO: Using the methods listed on the handout, modify the input strings to match the expected output on the handout.

    }

}
