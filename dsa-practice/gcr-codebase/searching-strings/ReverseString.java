public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        StringBuilder sb = new StringBuilder(str);
        String reversedStr = sb.reverse().toString();
        System.out.println("Reversed String: " + reversedStr);
    }    
}
