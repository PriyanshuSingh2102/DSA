class Solution {
    public int firstStableIndex(int[] nums, int k) {
        for(int i = 0; i < nums.length; i++) {
            
            int max = nums[0], min = nums[i];

            for(int j = 0; j <= i; j++)
                max = Math.max(max, nums[j]);

            for(int t = i; t < nums.length; t++)
                min = Math.min(min, nums[t]);

            if(max - min <= k)
                return i;
        }

        return -1;
    }
}