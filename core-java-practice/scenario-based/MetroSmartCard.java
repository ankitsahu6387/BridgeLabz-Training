import java.util.Scanner;

public class MetroSmartCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 200; // initial balance
        int distance;
        boolean travel = true;
        System.out.println("---- Delhi Metro Smart Card System ----");
        while (travel && balance > 0) {
            System.out.println("\nCurrent Balance: ₹" + balance);
            System.out.print("Enter distance in km (or -1 to quit): ");
            distance = sc.nextInt();
            if (distance == -1) {
                break;
            }
            int fare = (distance <= 5) ? 20 : 40;
            if (balance >= fare) {
                balance -= fare;
                System.out.println("Fare deducted: ₹" + fare);
            } else {
                System.out.println("Insufficient balance.");
                travel = false;
            }
        }
        System.out.println("\nThank you for using Delhi Metro.");
        sc.close();
    }
}
