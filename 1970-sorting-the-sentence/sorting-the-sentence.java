class Solution {
    public String sortSentence(String s) {
        String res = "";
        String[] str = s.split(" ");

        for (int j = 1; j <= str.length; j++) {
            for (int i = 0; i < str.length; i++) {
                String str1 = str[i];

                if (Character.getNumericValue(str1.charAt(str1.length() - 1)) == j) {
                    res += str1.substring(0, str1.length() - 1) + " ";
                }
            }
        }

        return res.trim();
    }
}