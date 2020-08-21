public class Pizza {
    public final String type;
    public final int size;

    public Pizza(String type, int size) {
        this.type = type;
        this.size = size;
    }
// getPrice	double	none
//toString	String	none
    // Size	Price
//6 or less inches	$6.50
//7-8 inches	$11.50
//9-11 inches	$15.50
//12 or more inches	$20.50
    public double getPrice() {
        double price;
        if (size <= 6) {
            price = 6.50;
        } else if (size <= 8) {
            price = 11.50;
        } else if (size <= 11) {
            price = 15.50;
        } else {
            price = 20.50;
        }
        return price;
    }

    public String toString() {
        return type + ", " + size + " in.";
    }


}
