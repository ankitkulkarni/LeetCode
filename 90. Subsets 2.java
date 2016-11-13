public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        giveSubsets(result, new ArrayList<Integer>(), nums, 0);
        return result;
    }
    void giveSubsets(ArrayList<List<Integer>> result, ArrayList<Integer> list, int[] nums, int start){
        result.add(new ArrayList<>(list));
        for(int i = start; i < nums.length; i++){
            if(i > start && nums[i] == nums[i - 1]){
                continue;
            }
            list.add(nums[i]);
            giveSubsets(result, list, nums, i + 1);
            list.remove(list.size() - 1);
        }
    }
}