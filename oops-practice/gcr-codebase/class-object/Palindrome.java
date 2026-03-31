class PalindromeChecker {
    String text;

    // Constructor to initialize text
    PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if text is palindrome
    boolean isPalindrome() {
        String cleanedText = text.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleanedText).reverse().toString();
        return cleanedText.equals(reversed);
    }

    // Method to display result
    void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is palindrome");
        } else {
            System.out.println(text + " is not Palindrome");
        }
    }
}

public class Palindrome {
    public static void main(String[] args) {
        PalindromeChecker p1 = new PalindromeChecker("A man a plan a canal Panama");
        PalindromeChecker p2 = new PalindromeChecker("Hello");

        p1.displayResult();
        p2.displayResult();
    }
}
