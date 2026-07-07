class Solution {
    public String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++) {
            String ch = words[i], rev = "";

            for (int j = 0; j < ch.length(); j++) {
                rev = ch.charAt(j) + rev;
            }

            if (rev.equals(ch))
                return ch;
        }

        return "";
    }
}