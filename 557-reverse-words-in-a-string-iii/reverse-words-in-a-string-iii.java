class Solution {
    public String reverseWords(String s) {
        String str1="",str="";
        s=s+" ";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i); 
            if(ch!=' '){
            str=ch+str;}
            else{
             if(i!=s.length()-1)
            str1=str1+str+" ";
            else 
            str1=str1+str;
            str="";
        }}
        return str1;
    }
}