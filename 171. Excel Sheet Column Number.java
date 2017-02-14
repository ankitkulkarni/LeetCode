public class Solution {
    public int titleToNumber(String s) {
        int index = 0;
        for(int i = 0; i < s.length(); i++){
            index = index * 26 + (s.charAt(i) - 'A' + 1);
        }
        return index;
    }
}