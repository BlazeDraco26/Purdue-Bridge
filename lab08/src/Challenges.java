/**
 * Purdue CS Bridge - Lab 08 (Repetition Challenge)
 * Challenges.java
 * A set of challenges related to repetition.
 *
 * @author YOUR_NAME, YOUR_EMAIL
 * @version 01/01/1970
 */
public class Challenges {

    public static void main(String[] args) {
        System.out.println(stringReversal("apple"));
        System.out.println(sumFrom1toN(5));
        printPrimeFrom2ToN(-1);
    }
        /**
         * Return a string that is reverse of the original given string.
         * @param str a string used as input
         * @return the reversal of the input string
         */
    public static String stringReversal(String str) {
        // TODO: Implement method
        String reversal = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversal = reversal + str.charAt(i);
        }
        return reversal;
    }

    /**
     * Return the sum of all natural numbers from 1 to n.
     * @param n an int that is the upper limit to sum all numbers up to
     * @return the sum of all natural numbers from 1 to n
     */
    public static int sumFrom1toN(int n) {
        // TODO: Implement method
        int sum = 0;
        for (int j = 1; j <= n; j++) {
            sum = sum + j;
        }
        return sum;
    }

    /**
     * Print all prime numbers from 2 to n in the format specified in the handout.
     * @param n an int that is the upper limit to print all prime numbers up to
     */
    public static void printPrimeFrom2ToN(int n) {
        // TODO: Implement method
        boolean isPrime = true;
        if (n <= 1) {
            System.out.print("2");
            return;
        }
        for (int i = 2; i <= n; i++) {
            isPrime = true;
            for (int k = 2; k < i; k++) {
                if (i % k == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (i == 2) {
                System.out.print(i);
            } else if (isPrime) {
                System.out.print(", " + i);
            }
        }

    }

}
