public class Solution {
    public char findTheDifference(String s, String t) {
        int a = 0, b = 0;
        for(int i = 0; i < s.length(); i++){
            a += (int)s.charAt(i);
        }
        for(int i = 0; i < t.length(); i++){
            b += (int)t.charAt(i);
        }
        return (char)(b - a);
    }
}