class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int result = Math.round(purchaseAmount / 10.0f) * 10;
        return 100-result;
    }
}