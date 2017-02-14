public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            result[i] = 1;
            for(int j = 0; j < nums.length; j++){
                if(j == i){
                    continue;
                }
                else{
                    result[i] *= nums[j];
                }
            }
        }
        return result;
    }
}