class Solution {
    public String restoreString(String s, int[] indices) {
        char[] c=new char[s.length()];
        for(int i=0;i<indices.length;i++){
            c[indices[i]]=s.charAt(i);
        }
        String newStr ="";
        for(int i=0;i<c.length;i++){
            newStr=newStr+c[i];
        }
        return newStr;
    }
}