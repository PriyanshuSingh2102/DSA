class Solution {
    public int searchInsert(int[] nums, int target) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target||nums[i]>target){
            index=i;
             break;
            }
         if(nums[nums.length-1]<target|| index==0){
            index=i+1;
         }
    }
    return index;
    }
}