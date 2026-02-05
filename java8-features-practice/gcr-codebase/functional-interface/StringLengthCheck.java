import java.util.function.Function;

public class StringLengthCheck {

    public static void main(String[] args) {

        String message = "Welcome to the HR Portal";
        int limit = 20;

        // Function to get length of a string
        Function<String, Integer> lengthChecker = str -> str.length();

        int length = lengthChecker.apply(message);

        if (length > limit) {
            System.out.println("Message exceeds limit");
            System.out.println("Length: " + length);
        } else {
            System.out.println("Message within limit");
            System.out.println("Length: " + length);
        }
    }
}