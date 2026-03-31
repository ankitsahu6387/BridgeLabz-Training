import java.util.*;

public class IoTSensorReadings {
    public static void main(String[] args) {
        List<Double> sensorReadings = Arrays.asList(28.5, 35.2, 22.1, 40.6, 30.0);
        double threshold = 30.0;
        sensorReadings.stream()
                      .filter(reading -> reading > threshold)
                      .forEach(reading ->
                          System.out.println("High Reading: " + reading)
                      );
    }
}
