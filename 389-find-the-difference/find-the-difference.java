class Solution {
    public char findTheDifference(String s, String t) {

        if (s.equals("")) return t.charAt(0);

        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        char str = 0;

        for (int i = 0; i < t1.length; i++) {
            int c = 0;

            for (int j = 0; j < s1.length; j++) {
                if (t1[i] == s1[j]) {
                    c++;
                     s1[j] = '#';
                    break;
                }
            }

            if (c == 0) {
                str = t1[i];
            }
        }

        return str;
    }
}