import java.util.*;
public class FlipKey{
    public static String CleanseAndInvert(String str){
        if(str == null || str.length()<6 || str.contains(" ") || str.contains("@") || str.contains("#") || str.contains("$") || str.contains("&")){
            return "";
        }
        str = str.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()){
            if((c-0)%2!=0){
                sb.append(c);
            }
        }
        sb = sb.reverse();      
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<sb.length(); i++){
            if(i%2==0){
                ans.append(Character.toUpperCase(sb.charAt(i)));
            } else {
                ans.append(sb.charAt(i));
            }
        }
        return ans.toString();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word:");
        String word = sc.next();
        String ans = CleanseAndInvert(word);
        if(ans=="") System.out.println("Invalid Input");
        else System.out.println("The generated key is: " +ans);
    }
}