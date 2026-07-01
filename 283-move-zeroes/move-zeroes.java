class Solution {
    public void moveZeroes(int[] nums) {
        int []arr=new int[nums.length];
        int i,first=0,last=nums.length-1;
        for(i=0;i<nums.length;i++){
            if(nums[i]!=0) {
                arr[first++]=nums[i];
            }
        }
         for ( i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
    }
}}