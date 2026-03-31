public class StringCompression {
    public static String compress(String str){
        String newStr = "";
        for(int i=0; i<str.length(); i++){   //O(n)
            int count = 1;
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;                
            }
            newStr += str.charAt(i);
            if(count>1){
                newStr += count;
            }
        }
        return newStr;
    }
    public static void main(String[] args) {
        String str = "aaabbcdd";
        System.out.print(compress(str));
    }
}
