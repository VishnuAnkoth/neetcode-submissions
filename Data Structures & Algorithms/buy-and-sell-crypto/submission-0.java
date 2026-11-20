class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = 0;
        int sell = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < prices[buy]) {
                buy = i;
                if (buy > sell) {
                    sell = buy;
                }
            }
            if (prices[i] > prices[sell]) {
                sell = i;
            }
            int result = prices[sell] - prices[buy];
            if (profit < result) {
                profit = result;
            }
        }
        return profit;
    }
}
