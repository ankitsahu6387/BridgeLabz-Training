import java.util.*;

public class EmailNotifications {
    public static void main(String[] args) {
        List<String> emails = Arrays.asList(
            "ankit@gmail.com",
            "rahul@yahoo.com",
            "priya@outlook.com"
        );
        emails.forEach(email -> sendEmailNotification(email));
    }

    static void sendEmailNotification(String email) {
        System.out.println("Notification sent to " + email);
    }
}
