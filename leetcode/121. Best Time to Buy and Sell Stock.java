class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        int lowest = 0;
        for(int i = 0; i < prices.length; i++) {
            if((prices[i] - prices[lowest]) > result) {
		    result = (prices[i] - prices[lowest]);
	        }
            if(prices[i] < prices[lowest]) {
                lowest = i;
            }
        }
        return result;
    }
}
