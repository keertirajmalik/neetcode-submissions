class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;
        int buyPoint = 0;
        for (int i = 0; i < prices.length; i++) {
            int sellPrice = prices[i];

            int profit = prices[i] - prices[buyPoint];
            while (profit < 0 && buyPoint < i) {
                buyPoint++;
                profit = prices[i] - prices[buyPoint];
            }
            res = Math.max(res, profit);
        }
        return res;
    }
}
