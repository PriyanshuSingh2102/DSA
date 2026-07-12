class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] diff = new int[n];

        HashSet<Integer> set = new HashSet<>();

        // Prefix distinct counts
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
            prefix[i] = set.size();
        }

        set.clear();

        // Suffix distinct counts
        for (int i = n - 1; i >= 0; i--) {
            suffix[i] = set.size();
            set.add(nums[i]);
        }

        // Compute answer
        for (int i = 0; i < n; i++) {
            diff[i] = prefix[i] - suffix[i];
        }

        return diff;
    }
}