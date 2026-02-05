import java.util.function.Predicate;

public class TemperatureAlert {

    public static void main(String[] args) {

        // Current temperature
        double currentTemp = 45.5;

        // Predicate to check if temperature crosses threshold
        Predicate<Double> isHighTemp = temp -> temp > 40.0;

        // Alert logic
        if (isHighTemp.test(currentTemp)) {
            System.out.println("Alert! High Temperature: " + currentTemp + "°C");
        } else {
            System.out.println("Temperature is normal: " + currentTemp + "°C");
        }
    }
}