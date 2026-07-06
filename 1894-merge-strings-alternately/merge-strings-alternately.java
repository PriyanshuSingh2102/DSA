class Solution {
    public String mergeAlternately(String word1, String word2) {
        String str="";
        int len=(word1.length()>=word2.length())?word1.length():word2.length();
        for(int i=0;i<len;i++){
            if (i < word1.length())
              str += word1.charAt(i);

            if (i < word2.length())
               str += word2.charAt(i);
        }
        if(len<word1.length())
        {
            str+=word1.substring(len,word1.length()-1);
        }
          else if(len<word2.length())
        {
            str+=word2.substring(len,word2.length()-1);
        }
        return str;
    }
}