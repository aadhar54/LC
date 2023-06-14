class Solution {
    public int maxProfit(int[] prices) {
     int maxFromBackSide = Integer.MIN_VALUE;
        int maxProfit = 0;
    for(int index = prices.length - 1; index >= 0; index--){
        if(prices[index] > maxFromBackSide){
            maxFromBackSide = prices[index];
        }
        
        int profit = maxFromBackSide - prices[index];
        if(profit > maxProfit){
            maxProfit = profit;
        }
    }
        return maxProfit;
    }
}