import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in kilograms: ");
        double weight = sc.nextDouble();
        System.out.print("Enter height in centimeters: ");
        double height = sc.nextDouble()/100;;
        sc.close();
        double bmi = weight / (height * height);
        String status = "";
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            status = "Normal";
        } else if (bmi >= 25 && bmi < 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        System.out.print("BMI is " + bmi + " Your Status is " + status);
    }
}
