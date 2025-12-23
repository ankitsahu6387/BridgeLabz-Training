import java.util.Scanner;

public class BMIReport {
    static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);
        String status;
        if (bmi <= 18.4)
            status = "Underweight";
        else if (bmi <= 24.9)
            status = "Normal";
        else if (bmi <= 39.9)
            status = "Overweight";
        else
            status = "Obese";

        return new String[]{
                String.format("%.2f", bmi),
                status
        };
    }
    static String[][] processData(double[][] data) {
        String[][] result = new String[10][4];
        for (int i = 0; i < 10; i++) {
            String[] bmiData = calculateBMI(data[i][0], data[i][1]);
            result[i][0] = String.valueOf(data[i][1]);
            result[i][1] = String.valueOf(data[i][0]);
            result[i][2] = bmiData[0];
            result[i][3] = bmiData[1];
        }
        return result;
    }
    static void display(String[][] result) {
        System.out.println("Height(cm)\tWeight(kg)\tBMI\tStatus");
        for (int i = 0; i < result.length; i++) {
            System.out.println(
                    result[i][0] + "\t\t" +
                    result[i][1] + "\t\t" +
                    result[i][2] + "\t" +
                    result[i][3]
            );
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height(cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }
        String[][] result = processData(data);
        display(result);
        sc.close();
    }
}
