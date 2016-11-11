public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int answer = findTheNumber(nums, target);
        if(answer == nums.length || nums[answer] != target){
            return new int[]{-1, -1};
        }
        return new int[]{answer, findTheNumber(nums, target + 1) - 1};
    }
    public int findTheNumber(int[] nums, int target){
        int low = 0, high = nums.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return low;
    }
}


public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int answer = findTheNumber(nums, target);
        if(answer == nums.length || nums[answer] != target){
            return new int[]{-1, -1};
        }
        return new int[]{answer, findTheNumber(nums, target + 1) - 1};
    }
    public int findTheNumber(int[] nums, int target){
        int low = 0, high = nums.length;
        while(low < high){
            int mid = low + (high - low)/2;
            if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid;
            }
        }
        return low;
    }
}