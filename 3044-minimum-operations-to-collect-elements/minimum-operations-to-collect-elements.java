class Solution {
    public int minOperations(List<Integer> nums, int k) {
        Set<Integer> set = new HashSet<>();
        int op = nums.size() - 1;
        int count = 0;

        while(set.size() < k) {
            if(nums.get(op) <= k) {
                set.add(nums.get(op));
            }

            count++;
            op--;
        }

        return count;
    }
}