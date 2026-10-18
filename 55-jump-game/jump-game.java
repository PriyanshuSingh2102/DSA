
class Solution {
    public boolean canJump(int[] nums) {
        int l = nums.length;

        if (l == 1) return true;
        if (l == 0) return false;

        for (int i = 0; i < l; i++) {
            if (i + nums[i] >= l - 1)
                return true;

            if (nums[i] == 0 && i != l - 1) {
                boolean reachable = false;

                for (int j = 0; j < i; j++) {
                    if (j + nums[j] > i) {
                        reachable = true;
                        break;
                    }
                }

                if (!reachable) return false;
            }
        }

        return false;
    }
}
