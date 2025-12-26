public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "ankit sahu";
        str = str.toLowerCase();
        String newStr = "";
        for(char c: str.toCharArray()){
            if(newStr.indexOf(c)==-1) newStr+=c;
        }
        System.out.println(newStr);
    } 
}
