public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        createCombinationList(result, new ArrayList<Integer>(), candidates, 0, target);
        return result;
    }
    public void createCombinationList(List<List<Integer>> result, List<Integer> list, int[] candidates, int start, int target){
        if(target < 0){
            return;
        }
        else if(target == 0){
            result.add(new ArrayList<Integer>(list));
        }
        else{
            for(int i = start; i < candidates.length; i++){
                list.add(candidates[i]);
                createCombinationList(result, list, candidates, i, target - candidates[i]);
                list.remove(list.size() - 1);
            }
        }
    }
}