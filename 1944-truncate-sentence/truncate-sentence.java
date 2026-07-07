class Solution {
    public String truncateSentence(String s, int k) {
        int c=0;
        s=s+" ";
        String str="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' ')
             str+=s.charAt(i);
             else{
                c++;
                str+=" " ;
             }
             if(c==k)
                 break;
        }
        return str.trim();
    }
}