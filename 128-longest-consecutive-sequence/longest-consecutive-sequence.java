import java.util.Arrays;

class Solution {

    public int longestConsecutive(int[] nums) {

        int size = nums.length;

        if (size == 0)
            return 0;

        Arrays.sort(nums);

        int c = 1;
        int max = 1;
        int t = nums[0];

        for(int i = 1; i < size; i++) {

            if(t == nums[i])
                continue;

            if(nums[i] == t + 1) {
                c++;
                t = nums[i];
            }
            else {
                c = 1;
                t = nums[i];
            }

            if(c > max)
                max = c;
        }

        return max;
    }
}