import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
public class Main {
      public static void main(String[] args) {

        List<GymMember> members = Arrays.asList(
            new GymMember("Ankit", LocalDate.now().plusDays(10)),
            new GymMember("Rahul", LocalDate.now().plusDays(40)),
            new GymMember("Priya", LocalDate.now().plusDays(25))
        );
        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);
        List<GymMember> expiringSoon =
            members.stream()
                  .filter(m -> m.expiryDate.isAfter(today)
                            && m.expiryDate.isBefore(next30Days))
                  .collect(Collectors.toList());
        expiringSoon.forEach(m -> 
            System.out.println(m.name + " expires on " + m.expiryDate)
        );
    }
}
