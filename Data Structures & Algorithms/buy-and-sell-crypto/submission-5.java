class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1) {
            return 0;
        } 

        int min_price = prices[0];
        int min_buy = prices[0];
        int max_sell = prices[1];
        int max_profit = prices[1] - prices[0];

        for(int i = 1; i < prices.length; i++) {
            int difference = prices[i] - min_price;

            if(difference > max_profit) {
                max_profit = difference;
                min_buy = min_price;
                max_sell = prices[i];
            }

            min_price = Math.min(min_price, prices[i]);
        }


        if(max_sell - min_buy > 0) {
            return max_sell - min_buy;
        } else {
            return 0;
        }
    }
}
