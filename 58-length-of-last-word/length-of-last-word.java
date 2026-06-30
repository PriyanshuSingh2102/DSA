class Solution {
    public int lengthOfLastWord(String s) {
        int size = s.length() - 1;
        int count = 0;

        while (size >= 0) {
            if (s.charAt(size) != ' ') {
                count++;
            } else if (count > 0) {
                break;
            }
            size--;
        }

        return count;
    }
}