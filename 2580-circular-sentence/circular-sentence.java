class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] str = sentence.split(" ");

        for (int i = 0; i < str.length; i++) {
            if (i != str.length - 1) {
                if (str[i].charAt(str[i].length() - 1) != str[i + 1].charAt(0))
                    return false;
            } else {
                if (str[i].charAt(str[i].length() - 1) != str[0].charAt(0))
                    return false;
            }
        }

        return true;
    }
}