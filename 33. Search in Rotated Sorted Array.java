public class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1, n = nums.length;
        while(start < end){
            int mid = start + (end - start)/2;
            if(nums[mid] > nums[end]){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        int rotations = start;
        start = 0;
        end = n - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            int realMid = (mid + rotations) % n;
            if(nums[realMid] == target){
                return realMid;
            }
            else if(nums[realMid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}