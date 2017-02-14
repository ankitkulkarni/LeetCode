public class Solution {
    public boolean search(int[] nums, int target) {
        int start = 0, end = nums.length - 1, n = nums.length;
        while(start < end){
            int mid = start + (end - start)/2;
            if(nums[mid] > nums[end]){
                start = mid + 1;
            }
            else if(nums[mid] < nums[end]){
                end = mid;
            }
            else{
                end--;
            }
        }
        int rotation = start;
        start = 0;
        end = n - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            int realMid = (mid + rotation) % n;
            if(nums[realMid] == target){
                return true;
            }
            else if(nums[realMid] < target){
                start = mid + 1;
            }
            else if(nums[realMid] > target){
                end = mid - 1;
            }
            else{
                end--;
            }
        }
        return false;
    }
}

272/273