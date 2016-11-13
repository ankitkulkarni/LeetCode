public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        givePermutations(result, new ArrayList<Integer>(), nums);
        return result;
    }
    public void givePermutations(ArrayList<List<Integer>> result, ArrayList<Integer> list, int[] nums){
        if(list.size() == nums.length){
            result.add(new ArrayList<>(list));
        }
        for(int i = 0; i < nums.length; i++){
            if(list.contains(nums[i])){
                continue;
            }
            list.add(nums[i]);
            givePermutations(result, list, nums);
            list.remove(list.size() - 1);
        }
    }
}