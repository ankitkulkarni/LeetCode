public class Solution {
    public void sortColors(int[] nums) {
        int c2 = nums.length - 1, c0 = 0;
        for(int i = 0; i <= c2; i++){
            while(nums[i] == 2 && i < c2){
                swap(i, c2--, nums);
            }
            while(nums[i] == 0 && i > c0){
                swap(i, c0++, nums);
            }
        }
    }
    void swap(int a, int b, int[] nums){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}