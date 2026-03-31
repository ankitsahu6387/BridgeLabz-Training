import java.util.*;
public class RemoveDuplicate {
    public static void main(String args[]){
        String str = "programming";
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        for(char ch: str.toCharArray()){
            if(!set.contains(ch)){
                set.add(ch);
                sb.append(ch);
            }
        }
        System.out.println("String after removing duplicates: " + sb.toString());
    }
}
