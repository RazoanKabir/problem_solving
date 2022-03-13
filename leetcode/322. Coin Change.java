class Solution {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int[] result = new int[amount+1];
        Arrays.fill(result, amount+1);
        result[0] = 0;
        for(int i=0; i <= amount; i++) {
            for(int j=0; j < coins.length; j++) {
                if(coins[j] <= i) {
                    result[i] = Math.min(result[i], 1+result[i - coins[j]]);   
                } else 
                    break;   
            }
        }
        if(result[amount] > amount) return -1;
        return result[amount];
    }
}