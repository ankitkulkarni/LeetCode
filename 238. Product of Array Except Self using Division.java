public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int product = 1, count = 0, index = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                count++;
                index = i;
                continue;
            }
            product *= nums[i];
        }
        if(count > 1){
            return result;
        }
        if(index >= 0){
            result[index] = product;
            return result;
        }
        for(int i = 0; i < result.length; i++){
            result[i] = product / nums[i];
        }
        return result;
    }
}