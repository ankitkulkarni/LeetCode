public class Solution {
    public int lengthOfLastWord(String s) {
        int lastLength = 0, i = s.length() - 1;
        while(i >= 0 && Character.isSpace(s.charAt(i))){
            i--;
        }
        while(i >= 0 && !Character.isSpace(s.charAt(i))){
            lastLength++;
            i--;
        }
        return lastLength;
    }
}