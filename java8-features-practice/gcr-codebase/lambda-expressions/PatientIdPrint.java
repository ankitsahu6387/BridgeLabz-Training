import java.util.*;

public class PatientIdPrint {

    public static void main(String[] args) {

        List<Integer> patientIds = List.of(101, 102, 103, 104);

        // Method Reference used here
        patientIds.forEach(System.out::println);
    }
}