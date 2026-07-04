class Solution {
    public int numJewelsInStones(String jewels, String stones) {
       char [] c1=jewels.toCharArray();
       char [] c2=stones.toCharArray();
       int freq=0; 
       for(int i=0;i<c1.length;i++){
        for(int j=0;j<c2.length;j++){
           if(c1[i]==c2[j])
            freq++;
        }
       }
       return freq; 
    }
}