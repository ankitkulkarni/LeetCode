public class Solution {
    public int removeDuplicates(int[] nums) {
        int length = 1, count = 1, temp = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]){
                if(count == 2){
                    while(i < nums.length && nums[i] == nums[i - 1]){
                        i++;
                    }
                    if(i < nums.length){
                        nums[temp++] = nums[i];
                        length++;
                        count = 1;
                    }
                }
                else if(count == 1){
                    nums[temp++] = nums[i];
                    count++;
                    length++;
                }
            }
            else{
                nums[temp++] = nums[i];
                length++;
                count = 1;
            }
        }
        return length;
    }
}