class Solution {
    public int firstUniqChar(String s) {
        char[] c = s.toCharArray();
        int len = c.length;

        for (int i = 0; i < len; i++) {
            int count = 0;

            for (int j = 0; j < len; j++) {
                if (c[i] == c[j]) {
                    count++;
                    if (count > 1) break;
                }
            }

            if (count == 1) {
                return i;
            }
        }

        return -1;
    }
}