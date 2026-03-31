import java.util.*;
class Flight {
    int id;
    String source;
    String destination;
    double price;
    public Flight(int id, String source, String destination, double price) {
        this.id = id;
        this.source = source;
        this.destination = destination;
        this.price = price;
    }
    void display() {
        System.out.println(id + " | " + source + " -> " + destination + " | ₹" + price);
    }
}
public class FlightBookingSystem {
    static Flight[] flights = {
        new Flight(1, "Delhi", "Mumbai", 4500),
        new Flight(2, "Delhi", "Bangalore", 5500),
        new Flight(3, "Mumbai", "Chennai", 5000)
    };
    static List<Flight> bookings = new ArrayList<>();
    static void searchFlight(String src, String dest) {
        for (Flight f : flights) {
            if (f.source.equalsIgnoreCase(src) &&
                f.destination.equalsIgnoreCase(dest)) {
                f.display();
            }
        }
    }
    static void bookFlight(int flightId) {
        for (Flight f : flights) {
            if (f.id == flightId) {
                bookings.add(f);
                System.out.println("Flight booked successfully!");
                return;
            }
        }
        System.out.println("Flight not found!");
    }
    static void viewBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings found.");
            return;
        }
        for (Flight f : bookings) {
            f.display();
        }
    }
    public static void main(String[] args) {
        searchFlight("delhi", "mumbai");
        bookFlight(1);
        viewBookings();
    }
}
