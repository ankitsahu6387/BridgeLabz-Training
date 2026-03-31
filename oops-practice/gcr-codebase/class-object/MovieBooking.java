class MovieTicket {
    String movieName;
    String seatNumber;
    double price;
    boolean isBooked;

    // Constructor to initialize ticket
    MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        this.isBooked = false;
    }

    // Method to book the ticket
    void bookTicket() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Ticket booked for movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + price);
        } else {
            System.out.println("House full!!! sorry..... Ticket already booked");
        }
        System.out.println("------------------------------");
    }

    // Method to display ticket details
    void displayTicket() {
        if (isBooked) {
            System.out.println("Ticket booked for movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + price);
        } else {
            System.out.println("Ticket have not booked yet....");
        }
        System.out.println("------------------------------");
    }
}

public class MovieBooking {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Dragon", "A10", 120.0);

        ticket.displayTicket();  // Ticket not booked
        ticket.bookTicket();     // Book ticket
        ticket.bookTicket();     // Try booking again
        ticket.displayTicket();  // Display ticket details
    }
}
