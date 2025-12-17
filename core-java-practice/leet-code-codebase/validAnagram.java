class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false; //if length is not same return false
        int arr[] = new int[26];
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i)-'a']++; // increasing index of char of s
            arr[t.charAt(i)-'a']--; // decreasing index of char of t
        }
        // check all index if zero
        for(int i=0; i<26; i++){
            if(arr[i] != 0) return false; // if any index is not zero return false
        }
        return true;
    }
}