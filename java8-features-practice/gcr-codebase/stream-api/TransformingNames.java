import java.util.*;

public class TransformingNames {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("ankit", "rahul", "priya", "neha");

        names.stream()
             .map(name -> name.toUpperCase())
             .sorted()
             .forEach(System.out::println);
    }
}
