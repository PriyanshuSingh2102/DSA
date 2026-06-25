import java.util.*;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {

        List<String> ans = new ArrayList<>();

        int start = 0;

        while (start < words.length) {

            int temp = words[start].length();
            int c = 1;
            int end = start + 1;

            while (end < words.length &&
                   temp + words[end].length() + c <= maxWidth) {
                temp += words[end].length();
                c++;
                end++;
            }

            String s = "";
            int totalSpace = maxWidth - temp;

            // Last line or single word
            if (end == words.length || c == 1) {

                for (int i = start; i < end; i++) {
                    s += words[i];

                    if (i != end - 1) {
                        s += " ";
                    }
                }

                while (s.length() < maxWidth) {
                    s += " ";
                }

            } else {

                int space = totalSpace / (c - 1);
                int extra = totalSpace % (c - 1);

                for (int i = start; i < end; i++) {

                    s += words[i];

                    if (i != end - 1) {

                        for (int k = 0; k < space; k++) {
                            s += " ";
                        }

                        if (extra > 0) {
                            s += " ";
                            extra--;
                        }
                    }
                }
            }

            ans.add(s);
            start = end;
        }

        return ans;
    }
}