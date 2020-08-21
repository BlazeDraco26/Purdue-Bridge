public class MovieTicket {

    private static final double BASE_PRICE = 11.99;
    private String title;
    private String genre;
    private String showtime;

    public MovieTicket() {
        title = "";
        genre = "";
        showtime = "";
    }

    public MovieTicket(String title, String genre, String showtime) {
        setTitle(title);
        setGenre(genre);
        setShowtime(showtime);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getShowtime() {
        return showtime;
    }

    public void setShowtime(String showtime) {
        this.showtime = showtime;
    }

    public double getPrice() {
        return BASE_PRICE;
    }

    public String toString() {
        return "This movie ticket is for the " + showtime + " showing of " + title + ", a " + genre + " movie. " +
                "The price of this ticket is $" + String.format("%.2f", getPrice()) + ".";
    }
}

