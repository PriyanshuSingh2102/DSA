class Solution {
    public boolean areOccurrencesEqual(String s) {
        char[] ch=s.toCharArray();
        int count=0;
        for(int i=0;i<ch.length;i++){
            char ch1=ch[i];
           if(ch1==ch[0]) count++;
        }
        for(char c='a';c<='z';c++){
            int count1=0;
            for(int i=0;i<ch.length;i++){
                if(c==ch[i])
                {
                    count1++;
                    ch[i]='#';
                }

            }
            if(count1 != 0 &&count1!=count)
            return false;
        }
        return true;
    }
}