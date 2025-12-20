import java.util.Scanner;
public class MeanHeightFootball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height[] = new double[11];
        System.out.println("Enter the heights of 11 football players in cm:");
        double sum = 0;
        for (int i = 0; i < 11; i++) {
            height[i] = sc.nextDouble();
            sum += height[i];
        }
        sc.close();
        double mean = sum / 11;
        System.out.println("Mean height of 11 football players is: " + mean);
    }
}
