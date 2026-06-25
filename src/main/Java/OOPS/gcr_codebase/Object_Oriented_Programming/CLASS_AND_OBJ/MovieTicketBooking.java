package main.Java.OOPS.gcr_codebase.Object_Oriented_Programming.CLASS_AND_OBJ;

class MovieTicket {

    String movieName;
    String seatNumber;
    double price;

    void bookTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }
}

public class MovieTicketBooking {

    public static void main(String[] args) {

        MovieTicket ticket = new MovieTicket();

        ticket.bookTicket("Avengers", "A12", 250);

        ticket.displayDetails();
    }
}