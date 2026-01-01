public class TextAnalyzer {
    public static void analyzeText(String paragraph, String oldWord, String newWord) {
        if (paragraph == null || paragraph.trim().isEmpty()) {
            System.out.println("Paragraph is empty or contains only spaces.");
            return;
        }
        paragraph = paragraph.trim().replaceAll("\\s+", " ");
        String[] words = paragraph.split(" ");
        int wordCount = words.length;
        String longestWord = words[0];
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        String replacedParagraph = paragraph.replaceAll("(?i)\\b" + oldWord + "\\b", newWord);
        System.out.println("Original Paragraph:");
        System.out.println(paragraph);
        System.out.println("\nWord Count: " + wordCount);
        System.out.println("Longest Word: " + longestWord);
        System.out.println("\nParagraph after Replacement:");
        System.out.println(replacedParagraph);
    }
    public static void main(String[] args) {
        String paragraph = "  Java is powerful. Java is object oriented and Java is popular.  ";
        String oldWord = "java";
        String newWord = "Python";
        analyzeText(paragraph, oldWord, newWord);
    }
}
