import java.util.*;
import java.util.stream.*;

public class UppercaseNames {
    public static void main(String[] args) {

        List<String> employees = Arrays.asList("Ankit", "Rahul", "Neha", "Pooja");
        employees.stream()
                 .map(String::toUpperCase)
                 .forEach(System.out::println);
    }
}