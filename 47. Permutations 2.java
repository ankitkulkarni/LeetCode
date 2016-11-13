public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        giveUniquePermutations(result, new ArrayList<Integer>(), nums, new boolean[nums.length]);
        return result;
    }
    public void giveUniquePermutations(ArrayList<List<Integer>> result, ArrayList<Integer> list, int[] nums, boolean[] used){
        if(list.size() == nums.length){
            result.add(new ArrayList<>(list));
        }
        else{
            for(int i = 0; i < nums.length; i++){
                if(used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])){
                    continue;
                }
                used[i] = true;
                list.add(nums[i]);
                giveUniquePermutations(result, list, nums, used);
                used[i] = false;
                list.remove(list.size() - 1);
            }
        }
    }
}