class Solution {
    public int maxProfit(int[] prices) {
        int res = 0;

        for (int i = 0; i < prices.length; i++) {
            int j = i;
            int buyPrice = prices[i];
            while (j < prices.length) {
                int profit = prices[j] - prices[i];
                if(profit < 0){
                    break;
                }

                res = Math.max(res, profit);
                j++;
            }
        }
        return res;
    }
}
