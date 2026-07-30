class Solution {
    public int maxNumberOfBalloons(String text) {
        String str = "balloon";
        int freq = Integer.MAX_VALUE;

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for(int j = 0; j < text.length(); j++) {
                if(ch == text.charAt(j)) {
                    count++;
                }
            }

            if(ch == 'l' || ch == 'o') {
                count = count / 2;
            }

            freq = Math.min(freq, count);
        }

        return freq;
    }
}