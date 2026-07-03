class Solution {
    public boolean detectCapitalUse(String word) {
        char[] c = word.toCharArray();
        if(Character.isUpperCase(c[0])){
            boolean allUpper = true;
            for(int i=1;i<c.length;i++){
              if(!Character.isUpperCase(c[i]))
              {
                allUpper=false;
                break;
              }
            }
            if(allUpper) return true;
        for(int i=1;i<c.length;i++){
              if(!Character.isLowerCase(c[i]))
              {
                return false;
               
            }}
            return true;
        }
        for(int i=0;i<c.length;i++){
              if(!Character.isLowerCase(c[i]))
              {
                return false;
                
              }}
            
            return true;
    }
    }