import java.util.Scanner;
public class AthleteRound {
    public static double numberOfRounds(int side1, int side2, int side3){
        double perimeter = side1+side2+side3;
        return 5000/perimeter; //km to meters

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three side1 of triangle in meters: ");
        int side1 = sc.nextInt();
        System.out.print("Enter three side2 of triangle in meters: ");
        int side2 = sc.nextInt();
        System.out.print("Enter three side3 of triangle in meters: ");
        int side3 = sc.nextInt();
        System.out.println("Number of round athlete have to complete is: " + numberOfRounds(side1, side2, side3));
        sc.close();
    }
}
