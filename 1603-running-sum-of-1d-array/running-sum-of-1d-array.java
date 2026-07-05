class Solution {
    public int[] runningSum(int[] nums) {
        int s=0,size=nums.length;
        int []nums1=new int[size];
        for(int i=0;i<nums.length;i++)
        {
                s+=nums[i];
                nums1[i]=s;
        }
        return nums1;
    }
}