import java.util.Scanner;

public class StudentScores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter number of students: ");
        while (!sc.hasNextInt() || (n = sc.nextInt()) <= 0) {
            System.out.print("Invalid input. Enter a positive number: ");
            sc.next();
        }
        float[] scores = new float[n];
        float sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter score of student " + (i + 1) + ": ");
            while (!sc.hasNextFloat() || (scores[i] = sc.nextFloat()) < 0) {
                System.out.print("Invalid score. Enter a non-negative number: ");
                sc.next();
            }
            sum += scores[i];
        }
        float average = sum / n;
        float highest = scores[0];
        float lowest = scores[0];
        for (float score : scores) {
            if (score > highest) highest = score;
            if (score < lowest) lowest = score;
        }
        System.out.println("\nAverage Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
        System.out.println("Scores above average:");
        for (float score : scores) {
            if (score > average) {
                System.out.println(score);
            }
        }
        sc.close();
    }
}
