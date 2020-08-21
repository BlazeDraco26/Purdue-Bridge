import java.util.Scanner;

/**
 * Purdue CS Bridge - Lab 06 (Selection Challenge)
 * Debug.java
 * This program creates an animal sanctuary inventory system.
 *
 * @author YOUR_NAME, YOUR_EMAIL
 * @version 01/01/1970
 */
public class Debug {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numAnimals;
        String response;
        int haveEnoughAnimals = 0;
        String favoriteAnimal;

        System.out.println("Welcome to the Animal Inventory System!\nHow many different animals do you have?");
        response = scanner.nextLine();
        numAnimals = Integer.parseInt(response);

        if (numAnimals > 20) {
            System.out.println("Error: You have too many animals in stock!");
        } else if (numAnimals < 0) {
            System.out.println("Error: You cannot have less than zero animals!");
        } else if (numAnimals <= 20 && numAnimals >= 0) {
            System.out.printf("%d is a good number of animals!\n", numAnimals);
        }

        System.out.println("What's your favorite kind of animal?");
        favoriteAnimal = scanner.nextLine();

        switch (favoriteAnimal.toLowerCase()) {
            case "dog":
                System.out.println("Dogs are great! Man's best friend!");
                break;
            case "cat":
                System.out.println("Cats are great for a newer pet owner!");
                break;
            case "fish":
                System.out.println("Fish are very low maintenance!");
                break;
            case "ferret":
                System.out.println("Ferrets are a rather uncommon pet but fun to have!");
                break;
            default:
                System.out.println("You selected an animal I didn't think of!");
        }
    }

}
