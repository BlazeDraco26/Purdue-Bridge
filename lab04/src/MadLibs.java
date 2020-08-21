import java.util.Scanner;

/**
 * Purdue CS Bridge – Lab 04 (Strings Challenge)
 * MadLibs.java
 * Implement a simple MadLibs game.
 *
 * @author YOUR_NAME, YOUR_EMAIL
 * @version 01/01/1970
 */
public class MadLibs {

    /**
     * Displays a MadLib game that prompts the user for input. Please put your code in here to generate the MadLib.
     * @param args an array of string arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to MadLibs!");
        Scanner input = new Scanner(System.in);
        char quotes = '"';
        System.out.println("Please enter: an adjective");
        String adj1 = input.nextLine();
        System.out.println("Please enter: an adjective");
        String adj2 = input.nextLine();
        System.out.println("Please enter: a plural noun");
        String pln = input.nextLine();
        System.out.println("Please enter: a plural noun");
        String pln2 = input.nextLine();
        System.out.println("Please enter: an adjective");
        String adj3 = input.nextLine();
        System.out.println("Please enter: an adverb");
        String av = input.nextLine();
        System.out.println("Please enter: a noun");
        String noun = input.nextLine();
        System.out.println("Please enter: a plural noun");
        String pln3 = input.nextLine();
        System.out.println("Please enter: the name of a famous person");
        String fp = input.nextLine();
        System.out.println("Please enter: a plural noun");
        String pln4 = input.nextLine();
        System.out.println("Please enter: an emotion");
        String emo = input.nextLine();
        System.out.println("Please enter: an adjective describing a person");
        String adj4 = input.nextLine();
        System.out.println("Please enter: a number");
        String number = input.nextLine();
        System.out.println("Please enter: an emotion");
        String emo2 = input.nextLine();
        String ml = "Welcome to Purdue University! \n" +
                "We are one of the most " + adj1 + " universities in the country.\n" +
                "Our campus is known for its " + adj2 + " " + pln + " and beautifully engineered " + pln2 + ".\n" +
                "Although our " + adj3 + " campus is in Indiana, we " + av + " attract students from all over the " +
                "world!\n" +
                "We are often called the " + quotes + noun + " of astronauts" + quotes + " for good reasons.\n" +
                "We have sent over 20 of " + "our " + pln3 + " into space, as well as the first person to walk the " +
                "moon:" + " " + fp + ".\n" +
                "Our computer " + "science " + "department attracts " + pln4 + " from the all " +
                "over the country.\n" +
                "We are so " + emo + " to have such a " + adj4 + " student like you to join us.\n" +
                "You'll love the next " + number + " " + emo2 + " years here!";
        System.out.println(ml); // Finally, display the MadLib
    }

}
