public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, count = 0, i = 0;
        while(i < nums.length){
            if(nums[i] == 1){
                count++;
            }
            else{
                max = max > count ? max : count;
                count = 0;
            }
            i++;
        }
        return max > count ? max : count;
    }
}