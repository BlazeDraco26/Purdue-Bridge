public class SeniorTicket extends MovieTicket {

    public SeniorTicket() {
        super();
    }

    public SeniorTicket(String title, String genre, String showtime) {
        super(title, genre, showtime);
    }

    public double getPrice() {
        return (3 / 4.) * super.getPrice();
    }

    public String toString() {
        return super.toString() + " This senior ticket is discounted 25%.";
    }

}
