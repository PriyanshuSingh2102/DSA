class Solution {
    public int findPeakElement(int[] nums) {
        int size=nums.length;
        if(size==1)
        return 0;
        if(size==2){
            if(nums[0]>nums[1]) return 0;
            
            return 1;
        }
        for(int i=0 ;i<size;i++){
        if(i==0 && nums[0]>nums[1])
        return i;
        if(i==size-1 && nums[i]>nums[i-1])
        return i;
        else if(i!=0 && i!=size-1 && nums[i]>nums[i-1] && nums[i]>nums[i+1])
         return i;
        }
        return -1;

    }
}