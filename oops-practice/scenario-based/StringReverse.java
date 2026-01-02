public class StringReverse {
    public static void main(String[] args) {
        String str = "Java";
        StringBuilder revStr = new StringBuilder();
        for(int i=str.length()-1; i>=0; i--){
            revStr.append(str.charAt(i));
        }
        System.out.println(revStr.toString());
    }
}
