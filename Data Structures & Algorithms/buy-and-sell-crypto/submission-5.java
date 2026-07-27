class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        int buyPoint = 0;
        for (int i = 0; i < prices.length; i++) {
            int sellPrice = prices[i];

            if (prices[buyPoint] < prices[i]) {
                int profit = prices[i] - prices[buyPoint];
                res = Math.max(res, profit);
            } else {
                buyPoint = i;
            }
        }
        return res;
    }
}
