class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;

        for (int i = 0; i < prices.length; i++) {
            int j = i;
            int buyPrice = prices[i];
            while (j < prices.length) {
                res = Math.max(res, prices[j] - prices[i]);
                j++;
            }
        }
        return res;
    }
}
