import java.util.Scanner;

/**
 * Purdue CS Bridge - Lab 06 (Selection Challenge)
 * AnimalGuesser.java
 * The program poses a list of questions for the user to answer.
 * Based on the answers provided, the program guesses an animal.
 *
 * @author YOUR_NAME, YOUR_EMAIL
 * @version 01/01/1970
 */
public class AnimalGuesser {

    final static String ERROR_MESSAGE = "Error: Invalid answer selected!";

    public static void main(String[] args) {
        boolean canFly, canSwim, isHousePet, hasShell, hasStripes,
            hasSaddle, huntsPrey, maleHunters = true, femaleHunters = false, hasQuills,
            retractsClaws, isAmphibian, hasScales, sharesAncestor;
        int numLegs;
        String animalGuess = null;
        String response = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to AnimalGuesser!\n" +
            "Answer the following questions, and I'll try to guess what type of animal you're thinking of!");

        // TODO: Utilize the scanner to receive input related to each question.
        System.out.println("Can it fly?");
        response = scanner.nextLine();
        if (response.equals("yes")) {
            canFly = true;
        } else if (response.equals("no")) {
            canFly = false;
        } else {
            System.out.println(ERROR_MESSAGE);
            return;
        }
        System.out.println("Can it swim?");
        response = scanner.nextLine();
        if (response.equals("yes")) {
            canSwim = true;
        } else if (response.equals("no")) {
            canSwim = false;
        } else {
            System.out.println(ERROR_MESSAGE);
            return;
        }
        System.out.println("How many legs does it have?");
        response = scanner.nextLine();
        if (response.equals("0")) {
            numLegs = 0;
        } else if (response.equals("2")) {
            numLegs = 2;
        } else if (response.equals("4")) {
            numLegs = 4;
        } else {
            System.out.println(ERROR_MESSAGE);
            return;
        }
        System.out.println("Is it a household pet?");
        response = scanner.nextLine();
        if (response.equals("yes")) {
            isHousePet = true;
        } else if (response.equals("no")) {
            isHousePet = false;
        } else {
            System.out.println(ERROR_MESSAGE);
            return;
        }
        System.out.println("Does it have retractable claws?");
        response = scanner.nextLine();
        if (response.equals("yes")) {
            retractsClaws = true;
        } else if (response.equals("no")) {
            retractsClaws = false;
        } else {
            System.out.println(ERROR_MESSAGE);
            return;
        }
        System.out.println("Does it have a shell?");
        response = scanner.nextLine();
        if (response.equals("yes")) {
            hasShell = true;
        } else if (response.equals("no")) {
            hasShell = false;
        } else {
            System.out.println(ERROR_MESSAGE);
            return;
        }
        System.out.println("Does it have stripes?");
        response = scanner.nextLine();
        if (response.equals("yes")) {
            hasStripes = true;
        } else if (response.equals("no")) {
            hasStripes = false;
        } else {
            System.out.println(ERROR_MESSAGE);
            return;
        }
        System.out.println("Do people use saddles with it?");
        response = scanner.nextLine();
        if (response.equals("yes")) {
            hasSaddle = true;
        } else if (response.equals("no")) {
            hasSaddle = false;
        } else {
            System.out.println(ERROR_MESSAGE);
            return;
        }
        System.out.println("Does it hunt prey animals?");
        response = scanner.nextLine();
        if (response.equals("yes")) {
            huntsPrey = true;
        } else if (response.equals("no")) {
            huntsPrey = false;
        } else {
            System.out.println(ERROR_MESSAGE);
            return;
        }
        if (huntsPrey) {
            System.out.println("Do males or females hunt prey?");
            System.out.println("(1) Males \n(2) Females \n(3) Both");
            response = scanner.nextLine();
            if (response.equals("1")) {
                maleHunters = true;
            } else if (response.equals("2")) {
                femaleHunters = true;
            } else if (response.equals("3")) {
                maleHunters = true;
                femaleHunters = true;
            } else {
                System.out.println(ERROR_MESSAGE);
                return;
            }
        } else {
            maleHunters = false;
            femaleHunters = false;
        }
        System.out.println("Does it have quills?");
        response = scanner.nextLine();
        if (response.equals("yes")) {
            hasQuills = true;
        } else if (response.equals("no")) {
            hasQuills = false;
        } else {
            System.out.println(ERROR_MESSAGE);
            return;
        }
        System.out.println("Is it an amphibian?");
        response = scanner.nextLine();
        if (response.equals("yes")) {
            isAmphibian = true;
        } else if (response.equals("no")) {
            isAmphibian = false;
        } else {
            System.out.println(ERROR_MESSAGE);
            return;
        }
        System.out.println("Does it have scales?");
        response = scanner.nextLine();
        if (response.equals("yes")) {
            hasScales = true;
        } else if (response.equals("no")) {
            hasScales = false;
        } else {
            System.out.println(ERROR_MESSAGE);
            return;
        }
        System.out.println("Does it share a genetic ancestor with humans?");
        response = scanner.nextLine();
        if (response.equals("yes")) {
            sharesAncestor = true;
        } else if (response.equals("no")) {
            sharesAncestor = false;
        } else {
            System.out.println(ERROR_MESSAGE);
            return;
        }

        // TODO: Develop the logic necessary to accurately choose an animal.
        switch (numLegs) {
            case 0:
                if (canSwim && isHousePet && hasScales) {
                    animalGuess = "fish";
                } else if (hasScales && huntsPrey && femaleHunters && maleHunters) {
                    animalGuess = "snake";
                }
                break;
            case 2:
                if (sharesAncestor) {
                    animalGuess = "gorilla";
                } else if (canFly && huntsPrey && femaleHunters && maleHunters) {
                    animalGuess = "owl";
                }
                break;
            case 4:
                if (isHousePet) {
                    if (retractsClaws) {
                        animalGuess = "cat";
                    } else if (hasQuills) {
                        animalGuess = "hedgehog";
                    } else if (hasShell && canSwim) {
                        animalGuess = "turtle";
                    } else {
                        animalGuess = "dog";
                    }
                } else if (canSwim && isAmphibian) {
                    animalGuess = "frog";
                } else if (hasSaddle) {
                    animalGuess = "horse";
                } else if (hasStripes) {
                    animalGuess = "zebra";
                } else if (huntsPrey && femaleHunters) {
                    animalGuess = "lion";
                }
                break;
            default:
                animalGuess = null;


        }


        //Dog: isHousePet, numLegs = 4
        //Cat: isHousePet, retractsClaws, numLegs = 4
        //Owl: canFly, huntsPrey, male and female hunters, numLegs = 2
        //Fish: canSwim, isHousePet, hasScales, numLegs = 0
        //Turtle: canSwim, isHousePet, hasShell, numLegs = 4
        //Hedgehog: isHousePet, hasQuills, numLegs = 4
        //Frog: canSwim, isAmphibian, numLegs = 4
        //Horse: hasSaddle, numLegs = 4
        //Zebra: hasStripes, numLegs = 4
        //Snake: hasScales, huntsPrey, male and female hunters, numLegs = 0
        //Gorilla: sharesAncestor, numLegs = 2
        //Lion: huntsPrey, only female hunters, numLegs = 4

        if (animalGuess != null) {
            System.out.println("I bet you're thinking of a(n) " + animalGuess + "!");
        } else {
            System.out.println("I couldn't think of anything!");
        }
    }

}
