public class StudentTicket extends MovieTicket {

    public StudentTicket() {
        super();
    }

    public StudentTicket(String title, String genre, String showtime) {
        super(title, genre, showtime);
    }

    public double getPrice() {
        if (super.getGenre().equals("Documentary")) {
            return (1 / 2.) * super.getPrice();
        }
        return (17 / 20.) * super.getPrice();
    }

    public String toString() {
        if (super.getGenre().equals("Documentary")) {
            return super.toString() + " This student ticket is discounted 50%.";
        }
        return super.toString() + " This student ticket is discounted 15%.";
    }
}
