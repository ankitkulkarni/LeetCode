public class Solution {
    public int firstUniqChar(String s) {
        int length = s.length();
        if(length == 0){
            return -1;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < length; i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), i);
            }
            else{
                map.put(s.charAt(i), length);
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i : map.values()){
            min = i < min ? i : min;
        }
        return min == length ? -1 : min;
    }
}