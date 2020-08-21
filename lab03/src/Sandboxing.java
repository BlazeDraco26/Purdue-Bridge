import java.util.Scanner;

public class Sandboxing {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int firstNumber = 4;
        int secondNumber = 2;
        int correctAnswer;
        correctAnswer = firstNumber * secondNumber;
        System.out.print("What is " + firstNumber + " * " + secondNumber + "? ");
        String answer = s.nextLine();
        System.out.print(correctAnswer == Integer.parseInt(answer));
    }

}

