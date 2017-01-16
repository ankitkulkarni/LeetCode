public class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int c = nums.length / 2;
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
            if(map.get(i) > c){
                return i;
            }
        }
        return nums[0];
    }
}