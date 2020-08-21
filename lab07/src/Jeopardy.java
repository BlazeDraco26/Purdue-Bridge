import java.util.Scanner;

/**
 * Purdue CS Bridge - Lab 07 (Intro to Repetition)
 * Jeopardy.java
 * The program begins a simplified version of the game "Jeopardy".
 * The program keeps track of games played, rounds, and points between players.
 *
 * @author YOUR_NAME, YOUR_EMAIL
 * @version 01/01/1970
 */

public class Jeopardy {

    private static int questionNum = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gamesPlayed = 0;
        int numRounds = 0;
        int whoIsCorrect = 0;
        int p1Score = 0;
        int p2Score = 0;
        int p3Score = 0;
        String response;
        boolean keepPlaying = false;

        System.out.println("Welcome to Jeopardy!");
        do {
            System.out.println("Games previously played: " + gamesPlayed);
            gamesPlayed++;
            System.out.println("How many rounds this game?");
            numRounds = scanner.nextInt();
            for (int i = 1; i <= numRounds; i++) {
                System.out.println("Round " + i + " starting...");
                askQuestion();
                System.out.println("Who answered correctly?");
                System.out.println("(1) Player 1 \n(2) Player 2 \n(3) Player 3");
                whoIsCorrect = scanner.nextInt();
                switch (whoIsCorrect) {
                    case 1:
                        System.out.println("Adding 10 points to Player 1's score...");
                        p1Score = p1Score + 10;
                        break;
                    case 2:
                        System.out.println("Adding 10 points to Player 2's score...");
                        p2Score = p2Score + 10;
                        break;
                    case 3:
                        System.out.println("Adding 10 points to Player 3's score...");
                        p3Score = p3Score + 10;
                        break;
                    default:
                        System.out.println("Nobody got it correct!");
                }
            }
            if (p1Score > p2Score && p1Score > p3Score) {
                System.out.println("Player 1 is the winner with " + p1Score + " points! Would you like to play another game? (yes/no)");
            } else if (p2Score > p1Score && p2Score > p3Score) {
                System.out.println("Player 2 is the winner with " + p2Score + " points! Would you like to play another game? (yes/no)");
            } else if (p3Score > p1Score && p3Score > p2Score) {
                System.out.println("Player 3 is the winner with " + p3Score + " points! Would you like to play another game? (yes/no)");
            } else {
                System.out.println("It's a tie! Would you like to play another game? (yes/no)");
            }
            response = scanner.nextLine();
            response = scanner.nextLine();
            if (response.equals("yes")) {
                keepPlaying = true;
            } else {
                keepPlaying = false;
            }
            p1Score = 0;
            p2Score = 0;
            p3Score = 0;
        } while (gamesPlayed < 10 && keepPlaying);
    }


    /**
     * Prints a sample Jeopardy question based on {@code questionNum}.
     * Please do not modify this method.
     */
    public static void askQuestion() {
        String question;
        
        switch (questionNum) {
            case 0:
                question = "In English, it's \"O Christmas Tree\"; in German, it's" +
                    " \"O\" this";
                break;
            case 1:
                question = "One day a year this restaurant chain offers free chicken" +
                    " if you dress like a cow";
                break;
            case 2:
                question = "John Gay in \"The Beggar's Opera\" calls it \"the knot" +
                    " that sacred love hath tied\"";
                break;
            case 3:
                question = "This term for an idea that cannot be criticized refers" +
                    " to a Hindu belief about an animal";
                break;
            case 4:
                question = "The Santa Lucia River provides much of the drinking" +
                    " water for this capital of Uruguay";
                break;
            case 5:
                question = "Completes the title metaphor from a 1986 hit song," +
                    " \"The Future's So Bright...\"";
                break;
            case 6:
                question = "Jefferson likened liberty to one of these that must be" +
                    " \"refreshed from time to time with the blood of patriots and tyrants\"";
                break;
            case 7:
                question = "\"A Christmas Carol\" says, \"However & whenever we" +
                    " part from one another, I am sure we shall none of us forget poor\" him";
                break;
            case 8:
                question = "Schiller's \"Ode To Joy\" sparked joy for this composer" +
                    " who used it for the choral movement of his \"Ninth Symphony\"";
                break;
            case 9:
                question = "One a Buddhist, one a South African Anglican, these 2" +
                    " religious leaders co-wrote \"The Book of Joy\"";
                break;
            default:
                return;
        }
        if (++questionNum == 10) {
            questionNum = 0;
        }
        System.out.println(question);
    }

}
