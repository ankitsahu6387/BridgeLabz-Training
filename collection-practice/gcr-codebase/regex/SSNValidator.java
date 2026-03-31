import java.util.regex.*;
public class SSNValidator {
    public static void main(String[] args) {
        String text1 = "My SSN is 123-45-6789.";
        String text2 = "My SSN is 123456789.";
        String regex = "\\b\\d{3}-\\d{2}-\\d{4}\\b";
        validateSSN(text1, regex);
        validateSSN(text2, regex);
    }
    static void validateSSN(String text, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println(matcher.group() + " is valid");
        } else {
            System.out.println(text + " is invalid");
        }
    }
}
