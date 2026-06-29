class Solution {
    public boolean isPalindrome(int x) {
        if(x>=0){
            int temp,s=0;
            temp=x;
            while(temp>0){
            s=(s*10)+temp%10;
            temp/=10;

            }
            if(s==x)
            return true;
            else
            return false;
        }
        return  false;
    }
}