class Solution {
    public int maximumValue(String[] strs) {
        int max=-1;
        for(int i=0;i<strs.length;i++){
            int count=0;
            boolean isNumeric=true;
            for(int j=0;j<strs[i].length();j++ ){
                if(Character.isDigit(strs[i].charAt(j)))
                count=(count*10)+(strs[i].charAt(j)-'0');
              else {
                  isNumeric=false;
                  break;
              }
            }
            if(!isNumeric) count=strs[i].length();
             if(max<count) max=count;
        }
       return max ;
    }
}