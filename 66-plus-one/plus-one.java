class Solution {
    public int[] plusOne(int[] digits) {
        int len= digits.length,count=0;
        for(int i=len-1;i>=0;i--){
            if(digits[i]==9){
            digits[i]=0;
            count++;
            }
            else
            {
                digits[i]=digits[i]+1;
                return digits;
            }

        }
        int [] arr=new int[len+1];
        if(count==len){
            arr[0]=1;
        }
        return arr;
    }
}