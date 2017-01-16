public class Solution {
    public int maxProfit(int[] prices) {
        int max = 0, currentMax = 0;
        for(int i = 1; i < prices.length; i++){
            currentMax = Math.max(0, currentMax + prices[i] - prices[i - 1]);
            max = currentMax > max ? currentMax : max;
        }
        return max;
    }
}