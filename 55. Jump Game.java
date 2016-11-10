public class Solution {
    public boolean canJump(int[] nums) {
        if(nums[0] == 0 && nums.length > 1){
            return false;
        }
        int location = nums.length - 1;
        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] + i >= location){
                location = i;
            }
        }
        return location == 0;
    }
}