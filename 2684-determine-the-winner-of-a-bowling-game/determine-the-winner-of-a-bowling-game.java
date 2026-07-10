class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int score = 0, score1 = 0;

        for (int i = 0; i < player1.length; i++) {
            if ((i >= 1 && player1[i - 1] == 10) ||
                (i >= 2 && player1[i - 2] == 10)) {
                score += 2 * player1[i];
            } else {
                score += player1[i];
            }
        }

        for (int i = 0; i < player2.length; i++) {
            if ((i >= 1 && player2[i - 1] == 10) ||
                (i >= 2 && player2[i - 2] == 10)) {
                score1 += 2 * player2[i];
            } else {
                score1 += player2[i];
            }
        }

        if (score > score1) return 1;
        if (score1 > score) return 2;
        return 0;
    }
}