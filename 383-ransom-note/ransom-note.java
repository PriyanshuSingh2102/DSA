class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] s1=ransomNote.toCharArray();
        char[]s2=magazine.toCharArray();
        int c=0;
        for(int i=0;i<s1.length;i++){
            for(int j=0;j<s2.length;j++){
                if(s1[i]==s2[j]){
                    c++;
                    s2[j]='#';
                    break;
                }
            
            }
        }
        return (c==s1.length);
        }
    }
