public class ConcatenateString {
    public static void main(String[] args) {
        String arr[] = new String[]{"Hello", "World", "from", "Java"};
        StringBuffer sb = new StringBuffer();
        for(String str : arr){
            sb.append(str).append(" ");
        }
        String concatStr = sb.toString().trim();
        System.out.println("Concatenated String: " + concatStr);
    }
}
