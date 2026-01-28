import java.util.*;
public class LexicalTwist{
    public static boolean isValidString(String str){
        return str.trim().contains(" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word1:");
        String word1 = sc.nextLine();
        if(isValidString(word1)){
            System.out.println(word1+" is  an invalid word");
            return;
        }
        System.out.println("Enter word2:");        
        String word2 = sc.nextLine();
        if(isValidString(word2)){
            System.out.println(word2+" is  an invalid word");
            return;
        } 
        String reversedWord1 = new StringBuilder(word1).reverse().toString();
        //1. Check if reversed word1 equals word2
        if(reversedWord1.equals(word2)){
            String reversedWord1Lower = reversedWord1.toLowerCase();
            StringBuilder reversedWord1LowerReplaced = new StringBuilder();
            for (char c : reversedWord1Lower.toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    reversedWord1LowerReplaced.append('@');
                } else {
                    reversedWord1LowerReplaced.append(c);
                }
            }
            System.out.println("Transformed Word: " + reversedWord1LowerReplaced);
        } else { //2. If not equal
            String concatenatedWords = word1 + word2;
            String upperCaseConcatenated = concatenatedWords.toUpperCase();
            int vowelCount = 0;
            int consonantCount = 0;
            for(char c : upperCaseConcatenated.toCharArray()){
                if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    vowelCount++;
                } else if (Character.isLetter(c)) {
                    consonantCount++;
                }
            }
            int count = 2;
            String output = "";
            if(vowelCount>consonantCount){                
                for(char c : upperCaseConcatenated.toCharArray()){
                    if (count > 0 && (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')) {
                        if(output.indexOf(c) == -1){
                            output += c;
                            count--;
                        }                        
                    }
                }
            System.out.println("Output: " + output);
            } else if(vowelCount<consonantCount){                
                for(char c : upperCaseConcatenated.toCharArray()){
                    if (count > 0 && (c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U')) {
                        if(output.indexOf(c) == -1){
                            output += c;
                            count--;
                        }                        
                    }
                }
                System.out.println("Output: " + output);
            } else {
                System.out.println("Equal Vowels and Consonants");
            }
        }
    }
}