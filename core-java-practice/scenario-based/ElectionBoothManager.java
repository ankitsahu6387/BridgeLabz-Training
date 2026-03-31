import java.util.Scanner;

public class ElectionBoothManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vote;
        boolean running = true;
        System.out.println("---- Welcome to Election Booth ----");
        while (running) {
            System.out.print("\nEnter your age (or -1 to exit): ");
            int age = sc.nextInt();
            // Exit condition
            if (age == -1) {
                running = false;
                break;
            }
            // Check eligibility
            if (age >= 18) {
                System.out.println("You are eligible to vote.");
                System.out.println("Press 1 for Candidate A");
                System.out.println("Press 2 for Candidate B");
                System.out.println("Press 3 for Candidate C");
                vote = sc.nextInt();
                switch (vote) {
                    case 1:
                        System.out.println("You voted for Candidate A.");
                        break;
                    case 2:
                        System.out.println("You voted for Candidate B.");
                        break;
                    case 3:
                        System.out.println("You voted for Candidate C.");
                        break;
                    default:
                        System.out.println("Invalid vote.");
                }
            } else {
                System.out.println("Sorry, you are not eligible to vote.");
            }
        }
        System.out.println("\nElection Booth Closed.");
        sc.close();
    }
}
