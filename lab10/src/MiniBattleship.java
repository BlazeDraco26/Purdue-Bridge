import java.util.Scanner;

/**
 * Purdue CS Bridge – Lab 10 (Arrays Challenge)
 * MiniBattleship.java
 * Contains code for a simplified version of Battleship.
 *
 * @author YOUR_NAME, YOUR_EMAIL
 * @version 01/01/1970
 */
public class MiniBattleship {

    /**
     * Places an 'x' at a specified position in the grid.
     * @param grid a two-dimensional char array
     * @param coordinate a string that specifies where to place `x`
     */
    public void attack(char[][] grid, String coordinate) {
        int xindex = 0;
        int yindex = 0;
        if (coordinate.length() != 2) {
            System.out.print("Invalid coordinate.\n");
        } else {
            xindex = coordinate.charAt(0) - 'A';
            yindex = coordinate.charAt(1) - '0';
            if (xindex > 8 || xindex < 0 || yindex > 8 || yindex < 0) {
                System.out.print("Invalid coordinate.\n");
            } else if (grid[xindex][yindex] == 's') {
                grid[xindex][yindex] = 'x';
                System.out.println(coordinate + " hit");
            } else {
                grid[xindex][yindex] = 'x';
                System.out.println(coordinate + " miss");
            }
        }

    }

    /**
     * Checks to see if there are any ships still on the grid.
     * @param grid a two-dimensional char array
     * @return true if there are no ships on the grid, false otherwise
     */
    public boolean victory(char[][] grid) {
        // TODO: Implement method and change return statement
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] == 's') {
                    return false;
                }
            }
        }

        return true;
    }

    /**
     * Prints out the gird in a specified format.
     * @param grid a two-dimensional char array
     */
    public void printGrid(char[][] grid) {
        // TODO: Implement method
        for (int i = 0; i < grid.length; i++) {
            System.out.println("-".repeat(19));
            for (int j = 0; j < grid.length; j++) {
                System.out.print("|" + grid[i][j]);
            }
            System.out.println("|");
        }
        System.out.println("-".repeat(19));
    }

    //====================================================================================//
    // Note: Do not touch anything below this comment; all work is in the methods above.
    //====================================================================================//

    public static final String RESET = "\u001B[0m";
    public static final String GREEN = "\u001B[32m";
    public static final String RED = "\u001B[31m";
    public static char[][] exampleGrid = {
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', 's', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', 's', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', 's', ' ', ' ', ' ', ' '},
            {'s', 's', 's', ' ', ' ', ' ', ' ', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 's'},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', 's', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', 's', ' ', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}
    };

    public static void main(String[] args) {
        MiniBattleship miniBattleship = new MiniBattleship();
        Scanner sc = new Scanner(System.in);
        int input;
        String coordinate;

        System.out.println(RED + "THIS IS USED TO TEST YOUR METHODS YOURSELF" + RESET);

        do {
            System.out.println("Please type a number.");
            System.out.println("1 - attack | 2 - print | 3 - quit");
            input = sc.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Type the coordinate of the space you wish to attack.");
                    sc.nextLine();
                    coordinate = sc.nextLine();
                    miniBattleship.attack(exampleGrid, coordinate);
                    break;
                case 2:
                    miniBattleship.printGrid(exampleGrid);
                    break;
                case 3:
                    System.out.println(RED + "Terminating." + RESET);
                    return;
                default:
                    break;
            }

        } while (!miniBattleship.victory(exampleGrid));

        System.out.println(GREEN + "Victory has been achieved." + RESET);
    }

}
