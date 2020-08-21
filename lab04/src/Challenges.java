/**
 * Purdue CS Bridge – Lab 04 (Strings Challenge)
 * Challenges.java
 * Implement a series of methods involving `String` manipulation.
 *
 * @author YOUR_NAME, YOUR_EMAIL
 * @version 01/01/1970
 */
public class Challenges {

    public static void main(String[] args) {
        String s = formatDate("12/25/05");
        System.out.println(s);
        System.out.println(capitalizeWord("world"));
        System.out.println(removeQuotes("\"My Name is Jordan\""));
        System.out.println(formatNumber("4089819290"));
        System.out.println(insert("Bob  Tomato", "The", 4));
        System.out.println(generateSquare(3));
    }
    /**
     * Returns a `String` with the first character capitalized.
     * @param word any `String` that may or may not be capitalized
     * @return a `String` with the first character capitalized
     */
    private static String capitalizeWord(String word) {
        String capital = word.toUpperCase().charAt(0) + word.substring(1);
        return capital;
    }

    /**
     * Returns a `String` with any double quotes encapsulating it removed.
     * @param string a `String` that is wrapped in double quotes
     * @return a `String` with any double quotes encapsulating it removed
     */
    private static String removeQuotes(String string) {
        String noQuotes = string.substring(1, string.lastIndexOf("\""));
        // String noQuotes = string.substring(1, string.length() - 1);
        // String noQuotes = string.substring(1, string.indexOf("\"", 1));
        return noQuotes;
    }

    /**
     * Returns a `String` in the format 'dd/mm/yy'.
     * @param date a `String` that is formatted 'mm/dd/yy'
     * @return Returns a `String` in the format 'dd/mm/yy
     */
    private static String formatDate(String date) {
        String month = date.substring(0, 2);
        String day = date.substring(3, 5);
        String year = date.substring(6, 8);
        return day + "/" + month + "/" + year;
    }

    /**
     * Returns a `String` in the format '(xxx)-xxx-xxxx'.
     * @param number a `String` that is formatted 'xxxxxxxxxx'
     * @return a `String` in the format '(xxx)-xxx-xxxx'
     */
    private static String formatNumber(String number) {
        String areaCode = number.substring(0, 3);
        String secondPart = number.substring(3, 6);
        String thirdPart = number.substring(6, 10);
        return "(" + areaCode + ")-" + secondPart + "-" + thirdPart;
    }

    /**
     * Returns a `String` with the given sequence inserted into the word parameter.
     * @param word a `String` that you will be injecting the sequence into
     * @param sequence a `String` that you will be injecting
     * @param position a number (`int`) indicating the index in which you will be inserting the sequence
     * @return a `String`, word, with the sequence inserted at the given position index
     */
    private static String insert(String word, String sequence, int position) {
        String part1 = word.substring(0, position);
        String part2 = word.substring(position);
        return part1 + sequence + part2;
    }

    /**
     * Returns a `String` composed of the character "#" in the shape of a square.
     * @param size a number (`int`) indicating the length (number of characters) of a side in the square
     * @return a `String` that resembles a square.
     */
    private static String generateSquare(int size) {
        String square = "";
        for (int count = 0; count < size; count++) {
            square = square + "#".repeat(size) + "\n";
        }
        return square;
    }

}
