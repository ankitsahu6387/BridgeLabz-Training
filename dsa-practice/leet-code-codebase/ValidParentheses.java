class Solution {
    public boolean isValid(String s) {
        char[] ch = s.toCharArray();
        for(int i=0; i<ch.length; i++){
            if(ch[0]=='(' | ch[i]=='{' | ch[i]=='['){
                if(ch[i]=='('){
                    if(ch[i+1]==')') i++;
                    else if(ch[i]=='{' | ch[i]=='[') continue;
                    else return false; 
                } else if(ch[i]=='{'){
                    if(ch[i+1]=='}') i++;
                    else if(ch[i]=='(' | ch[i]=='[') continue;
                    else return false;
                } else if(ch[i]=='['){
                    if(ch[i+1]==']') i++;
                    else if(ch[i]=='{' | ch[i]=='(') continue;
                    else return false;
                }
            } else return false;
        }
        return true;
    }
}