class Solution {
    public int alternateDigitSum(int n) {
        String str = "" + n;
        int sign = (str.length() % 2 == 0) ? -1 : 1;
        int sum = 0;

        while (n > 0) {
            sum += (n % 10) * sign;
            sign *= -1;
            n /= 10;
        }

        return sum;
    }
}