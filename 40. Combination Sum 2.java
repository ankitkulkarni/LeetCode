public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        createCombinationList2(result, new ArrayList<Integer>(), candidates, 0, target);
        return result;
    }
    public void createCombinationList2(ArrayList<List<Integer>> result, ArrayList<Integer> list, int[] candidates, int start, int target){
        if(target < 0){
            return;
        }
        else if(target == 0){
            result.add(new ArrayList<Integer>(list));
        }
        else{
            for(int i = start; i < candidates.length; i++){
                //skip duplicates
                if(i > start && candidates[i] == candidates[i - 1]){
                    continue;
                }
                list.add(candidates[i]);
                createCombinationList2(result, list, candidates, i + 1, target - candidates[i]);
                list.remove(list.size() - 1);
            }
        }
    }
}