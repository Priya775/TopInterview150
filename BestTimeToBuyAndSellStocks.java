class Solution {
    public int maxProfit(int[] prices) {
        int stockprize = prices[0];
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            stockprize = Math.min(stockprize,prices[i]);
            profit = Math.max(profit, prices[i] - stockprize);
        }
        return profit;
    }
}