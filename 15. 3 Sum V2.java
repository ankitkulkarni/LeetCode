public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<>();
        for(int i = 0; i < nums.length - 2; i++){
            if(i == 0 || (i > 0 && nums[i] != nums[i - 1])){
                int low = i + 1, high = nums.length - 1, sum = 0 - nums[i];
                while(low < high){
                    if(nums[low] + nums[high] == sum){
                        result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        low = incrementLow(nums, low, high);
                        high = decrementHigh(nums, low, high);
                    }
                    else if(nums[low] + nums[high] < sum){
                        low = incrementLow(nums, low, high);
                    }
                    else{
                        high = decrementHigh(nums, low, high);
                    }
                }
            }
        }
        return result;
    }
    public int incrementLow(int[] nums, int low, int high){
        while(low < high && nums[low] == nums[low + 1]){
            low++;
        }
        return ++low;
    }
    public int decrementHigh(int[] nums, int low, int high){
        while(low < high && nums[high] == nums[high - 1]){
            high--;
        }
        return --high;
    }
}