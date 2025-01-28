class Solution {
    public int maxProfit(int[] price) {
        int profit = 0;
        int buy = price[0];
        for(int i= 1; i < price.length;i++)
        {
            if(buy > price[i]) buy = price[i];
            profit = Math.max(profit ,price[i] - buy);
        }

        return profit;
        
    }
}