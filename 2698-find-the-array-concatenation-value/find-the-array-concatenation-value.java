class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int left = 0, right = nums.length - 1;
        long sum = 0;

        while (left <= right) {
            if (left == right) {
                sum += nums[left];
                break;
            }

            String str = "" + nums[left++] + nums[right--];
            sum += Long.parseLong(str);
        }

        return sum;
    }
}