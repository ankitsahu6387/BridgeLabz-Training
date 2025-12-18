import java.util.Scanner;
public class KmToMile2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble(); 
        double miles = km * 0.621371;
        System.out.println("The total miles is " + miles + " for the given " + km + " km");
        sc.close();
    }
}
