/**
 * Purdue CS Bridge – Lab 09 (Intro to Arrays)
 * ArrayManipulator.java
 * Contains basic array manipulation methods.
 *
 * @author YOUR_NAME, YOUR_EMAIL
 * @version 01/01/1970
 */
public class ArrayManipulator {

    public static void main(String[] args) {
        double[] array1 = new double[]{1, 2, 3, 4, 5};
        int[] array2 = new int[]{1, 2, 3, 4, 5};
        System.out.println(sumArray(array1));
        System.out.println(findMaxValue(array1));
        int[] oddNumbers;
        oddNumbers = evenToOdd(array2);
        for (int i : oddNumbers) {
            System.out.println(i);
        }
        String[] array3 = {"Alpha", "Zeta", "Omega", "", "Zeta"};
        String searchString = "";
        System.out.println(findString(array3, searchString));
        System.out.println(concatArray(array1, array1));
    }

    /**
     * Returns the sum of the array.
     * @param array the given input array
     * @return the sum of the array
     */
    public static double sumArray(double[] array) {
        // TODO: Implement method and change return statement
        double sum = 0;
        for (double i : array) {
            sum = sum + i;
        }
        return sum;
    }

    /**
     * Returns the maximum value from the array.
     * @param array the given input array
     * @return the maximum value from the array
     */
    public static double findMaxValue(double[] array) {
        // TODO: Implement method and change return statement
        double maxValue = 0;
        for (double i : array) {
            if (i > maxValue) {
                maxValue = i;
            }
        }
        if (array.length == 0) {
            maxValue = Double.MIN_VALUE;
        }

        return maxValue;
    }

    /**
     * Convert any even numbers in the array to the next odd number.
     * Example:
     *       4  ->   5
     *      20  ->  21
     *      -5  ->  -5
     *      -6  ->  -5
     * @param array the given input array
     * @return a new array that contains no even numbers
     */
    public static int[] evenToOdd(int[] array) {
        // TODO: Implement method and change return statement
        int index = 0;
        int[] oddOnly = new int[array.length];
        for (int i : array) {
            if (i % 2 == 0) {
                oddOnly[index] = array[index] + 1;
            } else {
                oddOnly[index] = array[index];
            }
            index++;
        }

        return oddOnly;
    }

    public static int[] evenToOdd2(int[] array) {
        // TODO: Implement method and change return statement
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = array[i] + 1;
            }
        }

        return array;
    }

    /**
     * Returns the index of the String in the array.
     * @param array the given input array
     * @param searchString the String we want to see exists in the array
     * @return the index of the String in the array or -1 if the String does not exist
     */
    public static int findString(String[] array, String searchString) {
        // TODO: Implement method and change return statement
        // array = {"Alpha", "Zeta", "Omega", "Omnicron", "Zeta"}, searchString = "Zeta"
        //  * array may be empty * searchString is case-sensitive * searchString may be empty * If searchString is not found in the array, return -1

        for (int i = 0; i < array.length; i++) {
            if (searchString.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Returns the concatenation of two arrays.
     * @param array1 a given input array
     * @param array2 a given input array
     * @return a new array that is the concatenation of the two arrays
     */
    public static double[] concatArray(double[] array1, double[] array2) {
        // TODO: Implement method and change return statement
        int index = 0;
        double[] array3 = new double[array1.length + array2.length];
        for (double i : array1) {
            array3[index] = array1[index];
            index++;
        }
        for (double j : array2) {
            array3[index] = array2[index - array1.length];
            index++;
        }

        return array3;
    }

    public static double[] concatArray2(double[] array1, double[] array2) {
        // TODO: Implement method and change return statement
        int index = 0;
        double[] array3 = new double[array1.length + array2.length];
        for (double d : array1) {
            array3[index] = d;
            index++;
        }
        for (double d : array2) {
            array3[index] = d;
            index++;
        }

        return array3;
    }
}
