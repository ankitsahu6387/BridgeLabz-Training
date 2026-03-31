public class CountVowelConsonants {
    public static void main(String[] args) {
        String str = "AnkitSahu";
        int vowelCount = 0, consCount=0;
        for(char c: str.toCharArray()){
            if((c>='A' && c<='Z') ||  (c>='a' || c<='z')){
                if("aeiouAEIOU".indexOf(c)!=-1) vowelCount++;
                else consCount++;
            }            
        }
        System.out.println("Total numbers of vowel is "+vowelCount+" and consonant is "+consCount);
    }
}
