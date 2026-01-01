public class TextFormatter {

    public static String autoCorrect(String paragraph) {
        paragraph = paragraph.trim();
        paragraph = paragraph.replaceAll("\\s+", " ");
        paragraph = paragraph.replaceAll("\\s*([.!?])\\s*", "$1 ");
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;
        for (int i = 0; i < paragraph.length(); i++) {
            char ch = paragraph.charAt(i);
            if (capitalizeNext && Character.isLetter(ch)) {
                result.append(Character.toUpperCase(ch));
                capitalizeNext = false;
            } else {
                result.append(ch);
            }

            if (ch == '.' || ch == '?' || ch == '!') {
                capitalizeNext = true;
            }
        }
        return result.toString().trim();
    }
    public static void main(String[] args) {
        String input = "   hello   world.this is   a test!how are you?   i am fine.  ";
        System.out.println(autoCorrect(input));
    }
}
