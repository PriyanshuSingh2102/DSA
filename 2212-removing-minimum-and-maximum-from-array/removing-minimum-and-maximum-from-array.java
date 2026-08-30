class Solution {
    public int minimumDeletions(int[] nums) {
        int max = nums[0], min = nums[0], n1 = 0, n2 = 0;

        if (nums.length == 1) return 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                n1 = i;
                max = nums[i];
            }

            if (nums[i] < min) {
                n2 = i;
                min = nums[i];
            }
        }

        int left = Math.max(n1, n2) + 1;
        int right = nums.length - Math.min(n1, n2);

        int both = Math.min(n1, n2) + 1
                 + nums.length - Math.max(n1, n2);

        return Math.min(Math.min(left, right), both);
    }
}