public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        int[] arr = new int[9];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
        }
        combination(result, new ArrayList<Integer>(), arr, 0, n, k);
        return result;
    }
    public void combination(List<List<Integer>> result, ArrayList<Integer> list, int[] nums, int start, int target, int size){
        if(target == 0 && list.size() == size){
            result.add(new ArrayList<>(list));
        }
        else{
            for(int i = start; i < nums.length; i++){
                list.add(nums[i]);
                combination(result, list, nums, i + 1, target - nums[i], size);
                list.remove(list.size() - 1);
            }
        }
    }
}




public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        combination(result, new ArrayList<Integer>(), 1, n, k);
        return result;
    }
    public void combination(List<List<Integer>> result, ArrayList<Integer> list, int start, int target, int size){
        if(target == 0 && list.size() == size){
            result.add(new ArrayList<>(list));
        }
        else{
            for(int i = start; i < 10; i++){
                list.add(i);
                combination(result, list, i + 1, target - i, size);
                list.remove(list.size() - 1);
            }
        }
    }
}