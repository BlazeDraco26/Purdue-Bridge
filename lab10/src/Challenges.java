/**
 * Purdue CS Bridge – Lab 10 (Arrays Challenge)
 * Challenges.java
 * A set of challenges related to arrays.
 *
 * @author YOUR_NAME, YOUR_EMAIL
 * @version 01/01/1970
 */
public class Challenges {

    public static void main(String[] args) {
        Challenges challenges = new Challenges();
        add3for4(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 1});
        System.out.println(challenges.sum42(new int[] {1, 2, 3}));
    }

    /**
     * Searches an array to see if the sum of two numbers is 42.
     * @param array an int array
     * @return true if the array contains two numbers whose sum is 42, else otherwise
     */

    public boolean sum42(int[] array) {
        // TODO: Implement method
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((array[i] + array[j]) == 42) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Create a new array where all numbers are grouped together by where they appear in the given array.
     * @param array an int array
     * @return a new array that has all numbers grouped together by where they appear in the given array
     */
    public int[] groupByNumbers(int[] array) {
        // TODO: Implement method
        // same numbers, group together (order doesn't matter)
        // {1, 3, 2, 3, 1} ---> {1, 1, 3, 3, 2}
        int n = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] == n) {
                array[i] = n;
            }

            // else statement (if number doesn't equal 1, remember index)
            // if statement (if number equals 1, move to remembered index)
        /*    for (int j = i + 1; j < array.length; j++) {
                if (j == i) {

                } */
            }
        }
    }

    /**
     * Create a new array that includes a 3 after every occurrence of a 4 in the given array.
     * @param array an int array
     * @return a new array that adds a 3 after every 4 in the original array
     */
    public static int[] add3for4(int[] array) {
        // TODO: Implement method
        int count = 0;
        int fourCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 4) {
                count++;
            }
        }
        int[] addThreeArr = new int[array.length + count];
        for (int j = 0; j < array.length; j++) {
            addThreeArr[j + fourCounter] = array[j];
            if (array[j] == 4) {
                fourCounter++;
                addThreeArr[j + fourCounter] = 3;
            }
        }
        return addThreeArr;
    }

}
