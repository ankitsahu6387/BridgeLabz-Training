import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        String feedback;
        System.out.println("Think of a number between 1 and 100");
        while (true) {
            int guess = (low + high) / 2;   // simple guess
            System.out.println("Computer guess: " + guess);
            System.out.print("Enter feedback (low / high / correct): ");
            feedback = sc.nextLine();
            if (feedback.equals("correct")) {
                System.out.println("Guessed correctly!");
                break;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            }
        }
        sc.close();
    }
}
