public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = i + 1;
        }
        getCombinations(result, new ArrayList<Integer>(), nums, 0, k);
        return result;
    }
    void getCombinations(ArrayList<List<Integer>> result, ArrayList<Integer> list, int[] nums, int start, int k){
        if(list.size() == k){
            result.add(new ArrayList<>(list));
        }
        else{
            for(int i = start; i < nums.length; i++){
                list.add(nums[i]);
                getCombinations(result, list, nums, i + 1, k);
                list.remove(list.size() - 1);
            }
        }
    }
}