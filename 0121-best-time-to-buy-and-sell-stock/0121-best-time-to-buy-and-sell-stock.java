class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int maxprofit = 0;
        int n = prices.length;
        for(int i = 0; i < n; i++)
        {
            buy = Math.min(buy, prices[i]);
            int profit = prices[i] - buy;
            maxprofit = Math.max(maxprofit, profit);
        }
        return maxprofit;
    }
}