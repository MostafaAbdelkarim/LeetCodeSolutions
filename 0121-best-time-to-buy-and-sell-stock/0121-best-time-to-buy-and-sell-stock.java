class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int initialBuy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < initialBuy) {
                initialBuy = prices[i];
            } 
            else if (prices[i] - initialBuy > profit) {
                profit = prices[i] - initialBuy;
            }
        }
        return profit;
    }
}