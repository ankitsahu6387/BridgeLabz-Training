import java.util.Scanner;

public class HeightConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int heightCm = sc.nextInt();
        double heightInch = heightCm / 2.54;
        double heightFeet = heightInch / 12;
        sc.close();
        System.out.println("The Height in cm is " + heightCm + " while in feet is " + heightFeet + " and in inches is " + heightInch);
    }
}
