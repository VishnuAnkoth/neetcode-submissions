class Solution {
    public int maxProfit(int[] prices) {
        int minBuy = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minBuy) {
                minBuy = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minBuy);
            }
        }
        return maxProfit;
    }
}
