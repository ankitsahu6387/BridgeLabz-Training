import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String word[] = str.split(" ");
        String longeststr = "";
        for(String s: word){
            if(s.length()>longeststr.length()) longeststr=s; 
        }
        System.out.println("Longest word is :" +longeststr);
    }
}
