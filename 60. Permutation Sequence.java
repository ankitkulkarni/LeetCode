public class Solution {
    public String getPermutation(int n, int k) {
        if(n == 1){
            return "1";
        }
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = i + 1;
        }
        int factorial = n;
        for(int i = n - 1; i > 0; i--){
            factorial *= i;
        }
        ArrayList<String> getResult = new ArrayList<>();
        getPermutations(getResult, new StringBuilder(), nums, k, new boolean[factorial]);
        return getResult.get(k - 1);
    }
    public void getPermutations(ArrayList<String> getResult, StringBuilder sb, int[] nums, int k, boolean[] used){
        if(sb.length() == nums.length){
            getResult.add(sb.toString());
        }
        else{
            for(int i = 0; i < nums.length; i++){
                if(used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])){
                    continue;
                }
                used[i] = true;
                sb.append(nums[i]);
                getPermutations(getResult, sb, nums, k, used);
                used[i] = false;
                sb.setLength(sb.length() - 1);
            }
        }
    }
}