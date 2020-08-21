public class ChildTicket extends MovieTicket {

    public ChildTicket() {
        super();
    }

    public ChildTicket(String title, String genre, String showtime) {
        super(title, genre, showtime);
    }

    public double getPrice() {
        return (4 / 5.) * super.getPrice();
    }

    public String toString() {
        return super.toString() + " This child ticket is discounted 20%.";
    }

}
