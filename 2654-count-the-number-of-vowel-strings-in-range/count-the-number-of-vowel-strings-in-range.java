class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int c=0;
        for (int i = left; i <= right; i++) {
            char ch = Character.toLowerCase(words[i].charAt(0));
            char ch1 = Character.toLowerCase(words[i].charAt(words[i].length() - 1));
            if ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') &&
              (ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u')) {c++;
    }
}
       return c;
    }
}