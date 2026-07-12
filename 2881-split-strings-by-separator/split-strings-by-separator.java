class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> ans = new ArrayList<>();

        for (String word : words) {
            String[] parts = word.split("\\" + separator);

            for (String s : parts) {
                if (!s.isEmpty()) {
                    ans.add(s);
                }
            }
        }

        return ans;
    }
}