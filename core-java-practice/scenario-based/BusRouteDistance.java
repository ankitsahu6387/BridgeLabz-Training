import java.util.Scanner;

public class BusRouteDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalDistance = 0.0;
        String getOff;
        while (true) {
            System.out.print("Enter distance to next stop (km): ");
            double distance = sc.nextDouble();
            totalDistance += distance;
            System.out.print("Does the passenger want to get off here? (yes/no): ");
            getOff = sc.next();
            if (getOff.equalsIgnoreCase("yes")) {
                System.out.println("Passenger gets off. Total distance travelled: " + totalDistance + " km");
                break;
            }
        }
        sc.close();
    }
}
