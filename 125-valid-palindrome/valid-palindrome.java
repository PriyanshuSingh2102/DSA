class Solution {
    public boolean isPalindrome(String s) {

        int len = s.length();

        if (s.equals(" "))
            return true;

        String str = "";
        String rev = "";

        for (int i = 0; i < len; i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                str += Character.toLowerCase(s.charAt(i));
            }
        }

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        return rev.equals(str);
    }
}