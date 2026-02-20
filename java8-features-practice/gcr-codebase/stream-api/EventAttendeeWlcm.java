import java.util.*;

public class EventAttendeeWlcm {
    public static void main(String[] args) {
        List<String> attendees = Arrays.asList("Ankit", "Rahul", "Priya", "Neha");
        attendees.forEach(name -> System.out.println("Welcome to the event, " + name));
    }
}
