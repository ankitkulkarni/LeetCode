public class Solution {
    public String reverseString(String s) {
        char[] c = s.toCharArray();
        int i = 0, j = c.length - 1;
        while(i < j){
            char ch = c[i];
            c[i++] = c[j];
            c[j--] = ch;
        }
        return String.valueOf(c);
    }
}