import java.util.*;
public class Main {
    public static void main(String args[]){
        List<Doctor> doctors = Arrays.asList(
            new Doctor("Dr. Mehta", "Neurology", false),
            new Doctor("Dr. Singh", "Orthopedics", true),
            new Doctor("Dr. Khan", "Dermatology", true),
            new Doctor("Dr. Sharma", "Cardiology", false)
        );
        System.out.println("Doctors available on weekends: ");
        doctors.stream()
               .filter(d -> d.availableOnWeekend) //weekend check
               .sorted((d1, d2) -> d1.specialty.compareTo(d2.specialty)) // sort by specialty
               .forEach(System.out::println);

    }
}
