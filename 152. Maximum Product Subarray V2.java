public class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0], previousMax = nums[0], previousMin = nums[0], currentMax = Integer.MIN_VALUE, currentMin = Integer.MAX_VALUE;
        for(int i = 1; i < nums.length; i++){
            currentMax = Math.max(Math.max(previousMax * nums[i], previousMin * nums[i]), nums[i]);
            currentMin = Math.min(Math.min(previousMax * nums[i], previousMin * nums[i]), nums[i]);
            max = Math.max(currentMax, max);
            previousMax = currentMax;
            previousMin = currentMin;
        }
        return max;
    }
}