public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        giveSubsets(result, new ArrayList<Integer>(), nums, 0);
        return result;
    }
    void giveSubsets(ArrayList<List<Integer>> result, ArrayList<Integer> list, int[] nums, int start){
        result.add(new ArrayList<>(list));
        for(int i = start; i < nums.length; i++){
            list.add(nums[i]);
            giveSubsets(result, list, nums, i + 1);
            list. remove(list.size() - 1);
        }
    }
}