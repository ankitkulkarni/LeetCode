public class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1, temp = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]){
                if(count == 2){
                    while(i < nums.length && nums[i] == nums[i - 1]){
                        i++;
                    }
                    i--;
                }
                else if(count == 1){
                    nums[temp++] = nums[i];
                    count++;
                }
            }
            else{
                nums[temp++] = nums[i];
                count = 1;
            }
        }
        return temp;
    }
}