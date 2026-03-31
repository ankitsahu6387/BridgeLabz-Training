import java.util.Scanner;

public class StudentScoreCard {
    static int[][] generateMarks(int n) {
        int[][] marks = new int[n][3];
        for (int i = 0; i < n; i++) {
            marks[i][0] = (int)(Math.random() * 101);
            marks[i][1] = (int)(Math.random() * 101);
            marks[i][2] = (int)(Math.random() * 101);
        }
        return marks;
    }
    static double[][] calculateStats(int[][] marks) {
        int n = marks.length;
        double[][] stats = new double[n][3];
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            stats[i][0] = Math.round(total * 100.0) / 100.0;
            stats[i][1] = Math.round(average * 100.0) / 100.0;
            stats[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return stats;
    }
    static void displayScoreCard(int[][] marks, double[][] stats) {
        System.out.println("Physics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%d\t%d\t\t%d\t%d\t%.2f\t%.2f%n",
                    marks[i][0], marks[i][1], marks[i][2],
                    (int)stats[i][0], stats[i][1], stats[i][2]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] marks = generateMarks(n);
        double[][] stats = calculateStats(marks);
        displayScoreCard(marks, stats);
        sc.close();
    }
}
