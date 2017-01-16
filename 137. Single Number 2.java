public class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }
            else{
                int count = map.get(nums[i]);
                map.put(nums[i], ++count);
            }
        }
        for(int i : map.keySet()){
            if(map.get(i) == 1){
                return i;
            }
        }
        return 0;
    }
}