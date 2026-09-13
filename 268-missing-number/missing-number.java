class Solution {
    public int missingNumber(int[] nums) {
        int size=nums.length,s=0;
       for(int i=0;i<size;i++)
        s+=nums[i];
        return ( (size*(size+1))/2  - s) ;
    }
}