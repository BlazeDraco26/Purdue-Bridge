import java.util.Scanner;

/**
 * Purdue CS Bridge – Lab 10 (Arrays Challenge)
 * ArrayOperations.java
 * Perform debugging on functions that are not functioning correctly.
 *
 * @author YOUR_NAME, YOUR_EMAIL
 * @version 01/01/1970
 */
public class ArrayOperations {

    /**
     * Returns the sum of all the numbers in the matrix.
     * @param grid a two-dimensional int array
     * @return the sum of all numbers in the grid
     */
    public static int sumMatrix(int[][] grid) {
        // TODO: Fix bug in method
        int sum = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                sum += grid[i][j];
            }
        }

        return sum;
    }

    /**
     * Swaps two specified positions in an array.
     * @param array a string array
     * @param firstPos one of the positions of the values being swapped
     * @param secondPos one of the positions of the values being swapped
     */
    public static void swap(String[] array, int firstPos, int secondPos) {
        // TODO: Fix bug in method
        String storage = "";
        storage = array[firstPos];
        array[firstPos] = array[secondPos];
        array[secondPos] = storage;
    }

    /**
     * Return a new array that contains all elements that come after the last `4` that occurs in the array.
     * @param array an int array
     * @return an array that contains all elements after the last occurring `4` in the given array
     */
    public static int[] after4(int[] array) {
        // TODO: Fix bug in method
        int i;
        for (i = array.length - 1; i >= 0; i--) {
            if (array[i] == 4) {
                i++;
                break;
            }
        }

        int[] result = new int[array.length - i];

        for (int j = 0; i < array.length; i++, j++) {
            result[j] = array[i];
        }

        return result;
    }

    //====================================================================================//
    // Note: Do not touch anything below this comment; all bugs are in the methods above.
    //====================================================================================//

    public static int[][] exampleGrid = {
        {4, 5, -2, -10},
        {-4, 10, 5},
        {1, 3, 6, 3, 7, 3},
        {-8}
    };

    public static String[] exampleStringArray = {
        "Exia", "Heavyarms", "Barbatos", "GX", "Age"
    };

    public static int[] exampleIntArray = {
        1, 4, -5, 4, 10, 59, 78, 4, 2
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select an option:");
        System.out.println("1 - sumMatrix() | 2 - swap() | 3 - after4()");
        int choice = sc.nextInt();
        int i;
        int pos1;
        int pos2;

        switch (choice) {
            case 1:
                System.out.printf("sumMatrix - The sum of the matrix is %d", sumMatrix(exampleGrid));
                break;
            case 2:
                System.out.println("swap - Enter the first position number:");
                pos1 = sc.nextInt();
                System.out.println("swap - Enter the second position number:");
                pos2 = sc.nextInt();

                System.out.println("----- Original Array -----");

                for (i = 0; i < exampleStringArray.length - 1; i++) {
                    System.out.printf("%s, ", exampleStringArray[i]);
                }
                System.out.printf("%s\n", exampleStringArray[i]);

                swap(exampleStringArray, pos1, pos2);

                System.out.println("----- After Swap -----");

                for (i = 0; i < exampleStringArray.length - 1; i++) {
                    System.out.printf("%s, ", exampleStringArray[i]);
                }
                System.out.printf("%s\n", exampleStringArray[i]);
                break;
            case 3:
                System.out.println("after4 - The resulting array:");
                int[] result = after4(exampleIntArray);
                for (i = 0; i < result.length - 1; i++) {
                    System.out.printf("%d, ", result[i]);
                }
                System.out.printf("%d\n", result[i]);
        }
    }

}
