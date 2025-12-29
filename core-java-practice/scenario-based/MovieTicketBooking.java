import java.util.Scanner;

public class MovieTicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char moreCustomers = 0;

        do {
            System.out.print("Enter movie type (1: Action, 2: Comedy, 3: Drama): ");
            int movieType = sc.nextInt();
            System.out.print("Enter seat type (gold/silver): ");
            String seatType = sc.next().toLowerCase();
            System.out.print("Do you want snacks? (yes/no): ");
            String snacks = sc.next().toLowerCase();
            double price = 0;
            switch (movieType) {
                case 1: price = 200; break; // Action
                case 2: price = 150; break; // Comedy
                case 3: price = 180; break; // Drama
                default: System.out.println("Invalid movie type!"); continue;
            }
            if (seatType.equals("gold")) {
                price += 100;
            } else if (seatType.equals("silver")) {
                price += 50;
            } else {
                System.out.println("Invalid seat type!"); continue;
            }
            if (snacks.equals("yes")) {
                price += 50;
            }
            System.out.println("Total ticket price: " + price);
            System.out.print("Add another customer? (y/n): ");
            moreCustomers = sc.next().toLowerCase().charAt(0);

        } while (moreCustomers == 'y');

        sc.close();
        System.out.println("Booking ended. Thank you!");
    }
}
