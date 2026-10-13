class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
       int []num=new int[nums.length];
       int k=0;
       for(int i=0;i<nums.length;i++){
         if(nums[i]<pivot)
          num[k++]=nums[i];
       }
       for(int i=0;i<nums.length;i++){
         if(nums[i]==pivot)
          num[k++]=nums[i];
       }
       for(int i=0;i<nums.length;i++){
         if(nums[i]>pivot)
          num[k++]=nums[i];
       }

        return num;
    }
}