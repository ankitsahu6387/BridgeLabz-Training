import java.util.Scanner;

public class CoffeeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double GST_RATE = 0.05;
        while (true) {
            System.out.println("\nAvailable Coffee Types:");
            System.out.println("1. Espresso - Rs.120");
            System.out.println("2. Cappuccino - Rs.150");
            System.out.println("3. Latte - Rs.180");
            System.out.println("Type 'exit' to stop");

            System.out.print("Enter coffee choice: ");
            String choice = sc.next();
            if (choice.equalsIgnoreCase("exit")) {
                System.out.println("Cafe closed for the day. Thank you!");
                break;
            }
            double price = 0;
            switch (choice) {
                case "1":
                    price = 120;
                    break;
                case "2":
                    price = 150;
                    break;
                case "3":
                    price = 180;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    continue;
            }
            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            double billAmount = price * quantity;
            double gst = billAmount * GST_RATE;
            double finalAmount = billAmount + gst;
            System.out.println("Bill Amount: Rs." + billAmount);
            System.out.println("GST: Rs." + gst);
            System.out.println("Total Payable: Rs." + finalAmount);
        }
        sc.close();
    }
}
