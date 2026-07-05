class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int c=0,n=nums[i];
            while(n>0){
                c++;
                n/=10;
            }
            if(c%2==0)
            count++;
        }
        return count;
    }
}