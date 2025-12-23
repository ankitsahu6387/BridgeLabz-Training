import java.util.Scanner;

public class VowelConsonantCount {
    static String checkCharacter(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || 
                ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }
    static int[] countVowelsAndConsonants(String text) {
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            String result = checkCharacter(ch);
            if (result.equals("Vowel")) {
                vowels++;
            } else if (result.equals("Consonant")) {
                consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        int[] count = countVowelsAndConsonants(input);
        System.out.println("Vowels count: " + count[0]);
        System.out.println("Consonants count: " + count[1]);
        sc.close();
    }
}
