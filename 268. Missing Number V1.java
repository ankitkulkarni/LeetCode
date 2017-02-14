public class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int num = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == num){
                num++;
            }
            else{
                return num;
            }
        }
        return num;
    }
}