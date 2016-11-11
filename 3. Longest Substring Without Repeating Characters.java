public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0, i = 0, j = 0;
        HashSet<Character> set = new HashSet<>();
        while(i < s.length() && j < s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                maxLen = Math.max(maxLen, j - i);
            }
            else{
                set.remove(s.charAt(i++));
            }
        }
        return maxLen;
    }
}