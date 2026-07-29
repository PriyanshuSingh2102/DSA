class Solution {
    public int maxPower(String s) {
        if (s.length() == 0) return 0;

        int count = 1;
        int max = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 1;
            }
        }

        return Math.max(max, count);
    }
}