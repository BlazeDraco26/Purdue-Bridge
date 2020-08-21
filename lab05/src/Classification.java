import java.util.Scanner;

/**
 * Purdue CS Bridge – Lab 05 (Intro to Selection)
 * Classification.java
 * This program creates a student classification that collects information.
 * The program then provides recommendations based on the data input.
 *
 * @author YOUR_NAME, YOUR_EMAIL
 * @version 01/01/1970
 */
public class Classification {

    public static void main(String[] args) {
        int creditsEarned = 0;
        int major = 0;
        int currentCredits = 0;
        double semesterDifficulty = 0.0;
        String classStanding = "";
        String dormSuggested = "";
        String studySpot = "";
        String majorString = "";

        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to the Purdue Student Classification System!");
        System.out.println("How many credits have you earned? (Please select between 0 and 120)");

        creditsEarned = s.nextInt();
        if (creditsEarned < 0 || creditsEarned > 120) {
            System.out.println("Error! Invalid number of credits.");
            return;
        }

        // TODO: Validate the user input of creditsEarned.

        System.out.println("What's your major?");
        System.out.println("(1): Computer Science \n" +
            "(2): Data Science \n" +
            "(3): Mathematics \n" +
            "(4): Biology \n" +
            "(5): Chemistry \n" +
            "(6): Physics \n" +
            "(7): None of the above");
        major = s.nextInt();

        System.out.println("How many credits are you taking this semester?");
        currentCredits = s.nextInt();
        if (currentCredits > 21) {
            System.out.println("Error! You can’t take more than 21 credits.");
            return;
        } else if (currentCredits < 3) {
            System.out.println("Error! You can’t take less than 3 credits.");
            return;
        }

        if (creditsEarned >= 90) {
            classStanding = "Senior";
        } else if (creditsEarned >= 60 && creditsEarned <= 89) {
            classStanding = "Junior";
        } else if (creditsEarned >= 30 && creditsEarned <= 59) {
            classStanding = "Sophomore";
        } else {
            classStanding = "Freshman";
        }

        if (classStanding == "Senior") {
            dormSuggested = "Hawkins";
            semesterDifficulty = semesterDifficulty + 22.0;
        }
        if (classStanding == "Junior") {
            dormSuggested = "Hillenbrand";
            semesterDifficulty = semesterDifficulty + 33.0;
        }
        if (classStanding == "Sophomore") {
            dormSuggested = "Shreve";
            semesterDifficulty = semesterDifficulty + 22.0;
        }
        if (classStanding == "Freshman") {
            dormSuggested = "Earhart";
            semesterDifficulty = semesterDifficulty + 11.0;
        }

        if (currentCredits >= 18) {
            semesterDifficulty = semesterDifficulty + 33.0;
        } else if (currentCredits <= 17 && currentCredits >= 15) {
            semesterDifficulty = semesterDifficulty + 27.5;
        } else if (currentCredits <= 14 && currentCredits >= 12) {
            semesterDifficulty = semesterDifficulty + 22.0;
        } else if (currentCredits <= 11 && currentCredits >= 9) {
            semesterDifficulty = semesterDifficulty + 16.5;
        } else if (currentCredits <= 8 && currentCredits >= 6) {
            semesterDifficulty = semesterDifficulty + 11.0;
        } else if (currentCredits <= 5 && currentCredits >= 0) {
            semesterDifficulty = semesterDifficulty + 5.5;
        }

        if (major == 1) {
            majorString = "Computer Science";
            studySpot = "Lawson";
            semesterDifficulty = semesterDifficulty + 33.0;
        }
        if (major == 2) {
            majorString = "Data Science";
            studySpot = "Haas";
            semesterDifficulty = semesterDifficulty + 16.5;
        }
        if (major == 3) {
            majorString = "Mathematics";
            studySpot = "Math";
            semesterDifficulty = semesterDifficulty + 22.0;
        }
        if (major == 4) {
            majorString = "Biology";
            studySpot = "Lilly";
            semesterDifficulty = semesterDifficulty + 5.5;
        }
        if (major == 5) {
            majorString = "Chemistry";
            studySpot = "Wetherill";
            semesterDifficulty = semesterDifficulty + 11.0;
        }
        if (major == 6) {
            majorString = "Physics";
            studySpot = "Physics";
            semesterDifficulty = semesterDifficulty + 27.5;
        }
        if (major == 7) {
            majorString = "None of the above";
            studySpot = "WALC";
            semesterDifficulty = semesterDifficulty + 0.0;
        }


        // TODO: Validate the user input of currentCredits.
        // TODO: Use if statements to determine the class standing based on creditsEarned.
        // TODO: Use if statements to determine where a student should live based on their class standing.
        // TODO: Use your knowledge of selection to determine where a student should study based on major.
        // TODO: Based on class standing, current credits, and major, calculate the difficulty of a student's semester.
        // Hint: What calculations overlap and could be computed in the same selection block?

        System.out.printf("Your class standing is: %s\n" +
                "Your major is: %s\n" +
                "You should live in: %s\n" +
                "You should study in: %s\n" +
                "On a scale of 1 - 99, 1 being the easiest possible, your semester is rated: %.1f\n",
                classStanding, majorString, dormSuggested, studySpot, semesterDifficulty);

        if (semesterDifficulty >= 75) {
            System.out.println("Prepare for one of the hardest semesters yet!");
        } else if (semesterDifficulty >= 50) {
            System.out.println("You can do this, but you'll have to work hard!");
        } else if (semesterDifficulty >= 25) {
            System.out.println("Don't worry too much about this one, but don't fall behind!");
        } else {
            System.out.println("This is pretty light! Maybe consider joining a club?");
        }
    }

}
