class Solution {
    public long maxAlternatingSum(int[] nums) {
        int l = nums.length;
        if(l==1){
            return nums[0]*nums[0];
        }
        for(int i=0;i<l;i++){
            if(nums[i]<0)
            nums[i]=nums[i]*-1;
        }
        Arrays.sort(nums);
        int n=0,low=0,high=l-1;
        long prod = 0;
        while(low<high)
        {
            long el1 = nums[low];
            long el2 = nums[high];
            prod += (el2*el2) - (el1*el1); 
            low++;
            high--;
        }
        if(l%2!=0){
            prod += nums[l/2]*nums[l/2];
        }
        return prod;       
        }
    
}