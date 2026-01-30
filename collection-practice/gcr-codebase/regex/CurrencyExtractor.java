import java.util.regex.*;
public class CurrencyExtractor {
    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50.";

        // Regex to match $ followed by numbers or plain decimal numbers
        String regex = "\\$?\\d+\\.\\d+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
