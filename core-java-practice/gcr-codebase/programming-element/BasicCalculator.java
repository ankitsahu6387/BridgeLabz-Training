import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;
        System.out.println("The addition, subtraction, multiplication and division of 2 numbers " + num1 + " and " + num2 + " is " + addition + ", " + subtraction + ", " + multiplication + " and " + division );
        sc.close();
    }
}
