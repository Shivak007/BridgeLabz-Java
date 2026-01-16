package objectorientedprogramming.oopfundamentals.level2;
import java.util.*;

class MovieTicket{
    private String movieName;
    private int seatNo;
    private double price;
    private boolean booked;

    MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNo = 0;
        this.price = 0;
        this.booked = false;
    }

    boolean bookTicket(int seatNumber, double price) {
        if (booked) {
            System.out.println("Ticket already booked! Seat: " + this.seatNo + ", Price: " + this.price);
            return false;
        }
        this.seatNo = seatNumber;
        this.price = price;
        this.booked = true;
        System.out.println("Ticket booked successfully!");
        return true;
    }

    void displayDetails(){
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNo);
        System.out.println("Price: ₹" + price);
    }
}

public class MovieBooking {
        public static void main(String[] args) {
            MovieTicket ticket1 = new MovieTicket("Inception");

            System.out.println("*** Ticket Details Before Booking ***");
            ticket1.displayDetails();

            ticket1.bookTicket(25, 300.0);

            System.out.println("\n*** Ticket Details After Booking ***");
            ticket1.displayDetails();

            System.out.println("\n*** Attempt Rebooking ***");
            ticket1.bookTicket(30, 350.0);
        }
    }


