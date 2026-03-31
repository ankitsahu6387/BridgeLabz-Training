import java.util.regex.*;
public class LanguageExtractor {
    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        String[] languages = {"Java", "Python", "JavaScript", "Go"};
        for (String lang : languages) {
            Pattern pattern = Pattern.compile("\\b" + lang + "\\b");
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
    }
}
