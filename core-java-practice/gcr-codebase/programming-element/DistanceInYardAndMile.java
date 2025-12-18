import java.util.Scanner;

public class DistanceInYardAndMile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distanceInFeet = sc.nextDouble();
        double distanceInYard = distanceInFeet / 3;
        double distanceInMile = distanceInYard / 1760;
        System.out.println("The distance of " + distanceInFeet + "feet in Yard is: " + distanceInYard+" and in mile is "+ distanceInMile);
        sc.close();
    }
}
