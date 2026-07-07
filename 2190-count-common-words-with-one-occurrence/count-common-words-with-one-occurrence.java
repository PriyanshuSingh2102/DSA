class Solution {
    public int countWords(String[] words1, String[] words2) {
        int count = 0;

        int[] freq = new int[words1.length];
        int[] freq1 = new int[words2.length];

        for (int i = 0; i < words1.length; i++) {
            int c = 0;
            for (int j = 0; j < words1.length; j++) {
                if (words1[i].equals(words1[j]))
                    c++;
            }
            freq[i] = c;
        }
        for (int i = 0; i < words2.length; i++) {
            int c = 0;
            for (int j = 0; j < words2.length; j++) {
                if (words2[i].equals(words2[j]))
                    c++;
            }
            freq1[i] = c;
        }

        // Count words appearing exactly once in both arrays
        for (int i = 0; i < words1.length; i++) {
            if (freq[i] == 1) {
                for (int j = 0; j < words2.length; j++) {
                    if (words1[i].equals(words2[j]) && freq1[j] == 1) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}