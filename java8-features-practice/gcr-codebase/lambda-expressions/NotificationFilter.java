import java.util.*;
import java.util.function.Predicate;
class Alert {
    String message;
    String type;   // EMERGENCY, APPOINTMENT, GENERAL

    Alert(String message, String type) {
        this.message = message;
        this.type = type;
    }

    @Override
    public String toString() {
        return type + " : " + message;
    }
}
public class NotificationFilter {

    public static void main(String[] args) {

        List<Alert> alerts = List.of(
            new Alert("Heart rate critical", "EMERGENCY"),
            new Alert("Doctor appointment at 5 PM", "APPOINTMENT"),
            new Alert("Health tips available", "GENERAL")
        );

        // User wants only EMERGENCY alerts
        Predicate<Alert> emergencyOnly = alert -> alert.type.equals("EMERGENCY");

        alerts.stream()
              .filter(emergencyOnly)
              .forEach(System.out::println);
    }
}