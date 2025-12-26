public class PalindromeString {
    public static void main(String[] args) {
        String str = "JAHAJ";
        StringBuilder sb = new StringBuilder();
        for(int i=str.length()-1; i>=0; i--){
            sb.append(str.charAt(i));
        }
        System.out.println("Is palindrome " + sb.toString().equals(str));
    }
}
