public class Main {

    public static void main(String[] args) {

        double distanceKm = 10;
        double weightKg = 5;

        System.out.println(distanceKm + " km = "
                + UnitConverter.kmToMiles(distanceKm) + " miles");

        System.out.println(weightKg + " kg = "
                + UnitConverter.kgToPounds(weightKg) + " lbs");
    }
}