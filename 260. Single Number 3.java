public class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.remove(nums[i]);
            }
            else{
                map.put(nums[i], i);
            }
        }
        int start = 0;
        int[] result = new int[map.size()];
        for(int i : map.keySet()){
            result[start++] = i;
        }
        return result;
    }
}