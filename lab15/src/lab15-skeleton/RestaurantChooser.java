import lab15.JOptionPane;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Purdue CS Bridge - Lab 15 (Graphical User Interfaces)
 * RestaurantChooser.java
 *
 * The program helps the user choose a restaurant by playing
 * a game called "5-2-1". The user can play multiple times.
 *
 * @author YOUR_NAME, YOUR_EMAIL
 * @version 01/01/1970
 */
public class RestaurantChooser {

    /**
     * Returns the restaurants for the user to select from.
     *
     * @return the restaurants for the user to select from
     */
    private static List<String> loadRestaurants() {
        final String[] restaurants = new String[]{"McDonald's", "Five Guys", "Two Fellas", "Noodles and Company",
            "Pappy's", "Papa John's", "Applebee's", "Peppercorn Kitchen", "Christos New York City Grill", "Katana " +
            "Sushi and Ramen", "FISHYA", "The Bryant", "Wendy's", "Culver's", "Pete's Za", "Cary Knight Spot", "Taco " +
            "Bell"};

        return new ArrayList<>(Arrays.asList(restaurants));
    }

    /**
     * Returns the bullet-pointed list of the restaurants.
     *
     * @param restaurants a sequence of names of restaurants
     * @return the bullet-pointed list of the restaurants
     */
    private static String listRestaurants(final String[] restaurants) {
        final StringBuilder builder = new StringBuilder();

        for (String restaurant : restaurants) {
            if (restaurant != null) {
                builder.append("\t• ").append(restaurant).append("\n");
            }
        }

        builder.deleteCharAt(builder.lastIndexOf("\n"));

        return builder.toString();
    }

    /**
     * Returns two restaurants that are randomly chosen from the given five.
     *
     * @param firstFive a list of five restaurant names
     * @return two restaurants that are randomly chosen from the given five
     */
    private static String[] pickTwoRestaurants(final String[] firstFive) {
        assert firstFive.length == 5;

        final ArrayList<Integer> indices = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4));

        Collections.shuffle(indices, JOptionPane.random);

        final String firstChoice = firstFive[indices.get(0)];
        final String secondChoice = firstFive[indices.get(1)];

        return new String[]{firstChoice, secondChoice};
    }

    /*
     * The code above this comment has been completed for you.
     * Implement your solution below this comment.
     */

    public static void main(String[] args) {
        final String welcomeMessage = "Welcome to Restaurant Chooser!\nWe will play a game called 5-2-1!\nYou will " +
            "choose five restaurants.\nThen I will choose two.\nFinally, you pick the restaurant!";
        final String privacyPolicy = "This application, \"Restaurant Chooser\", does not record, store, or transmit " +
            "any of your data.";
        final String restaurantPrompt = "Now, you're going to select five restaurants!";
        final String restaurantPrompt2 = "Select a restaurant from the list:";
        List<String> restaurants = loadRestaurants();
        Object[] response = {"Continue", "Privacy Policy", "Quit"};
        Object[] response2 = {"Continue", "Quit"};
        int answer = javax.swing.JOptionPane.showOptionDialog(null, welcomeMessage, "Restaurant Chooser", javax.swing.JOptionPane.YES_NO_CANCEL_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE,
                null, response, null);
        if (answer == JOptionPane.CANCEL_OPTION) {
            return;
        } else if (answer == JOptionPane.NO_OPTION) {
            int answer2 = javax.swing.JOptionPane.showOptionDialog(null, privacyPolicy, "Privacy Policy", javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE,
                    null, response2, null);
            if (answer2 == JOptionPane.NO_OPTION) {
                return;
            }
        } else {
            JOptionPane.showMessageDialog(null, restaurantPrompt);
        }
        String[] restaurantList = new String[5];
        while (true) {
            for (int i = 1; i <= 5; i++) {
                String answer3 = (String) JOptionPane.showInputDialog(null, restaurantPrompt2,
                        "Restaurant " + i + " of 5", javax.swing.JOptionPane.OK_CANCEL_OPTION, null, restaurants.toArray(),
                        null);
                restaurants.remove(answer3);
                restaurantList[i - 1] = answer3;
                JOptionPane.showMessageDialog(null, "So far, you have selected: \n" + listRestaurants(restaurantList));
            }
            JOptionPane.showMessageDialog(null, "You have selected these five restaurants: \n" + listRestaurants(restaurantList));
            JOptionPane.showMessageDialog(null, "Now I am going to choose two restaurants!");
            String[] twoRestaurants = pickTwoRestaurants(restaurantList);
            JOptionPane.showMessageDialog(null, "Here are the two restaurants I chose: \n" + listRestaurants(twoRestaurants));
            int answer4 = JOptionPane.showOptionDialog(null, "Now you need to pick one of the two restaurants!",
                    "Final Decision", javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE, null, twoRestaurants,
                    null);
            if (answer4 == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "You chose to eat at " + twoRestaurants[0] + "!");
            } else if (answer4 == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "You chose to eat at " + twoRestaurants[1] + "!");
            }
            int answer5 = JOptionPane.showOptionDialog(null, "Would you like to choose another restaurant?", null, javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE,
                    null, null, null);
            if (answer5 == JOptionPane.NO_OPTION) {
                break;
            }
            JOptionPane.showMessageDialog(null, restaurantPrompt);

        }
    }
}
