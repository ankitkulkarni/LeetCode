public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int currentSum = nums[0] + nums[1] + nums[nums.length - 1];
        int closestSum = currentSum;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
            if(i == 0 || (i > 0 && nums[i] != nums[i - 1])){
                int left = i + 1, right = nums.length - 1;
                while(left < right){
                    currentSum = nums[i] + nums[left] + nums[right];
                    if(currentSum < target){
                        while(left < right && nums[left + 1] == nums[left]){
                            left++;
                        }
                        left++;
                    }
                    else if(currentSum > target){
                        while(left < right && nums[right] == nums[right - 1]){
                            right--;
                        }
                        right--;
                    }
                    else{
                        return currentSum;
                    }
                    if(Math.abs(target - currentSum) < Math.abs(target - closestSum)){
                        closestSum = currentSum;
                    }
                }
            }
        }
    return closestSum;
    }
}