class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int tempprofit = 0;
        int profit = 0;

        for(int i = 0 ; i < prices.length; i++)
        {
            if(prices[i] < buy)
            {
                buy = prices[i];
            }
            else if(prices[i] > buy)
            {
                tempprofit = prices[i] - buy;
            }
            profit = Math.max(profit, tempprofit);
        }
        return profit;
    }
}