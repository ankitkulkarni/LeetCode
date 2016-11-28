public class Solution {
    public String reverseWords(String s) {
        s = s.trim().replaceAll("( )+", " "); //s = s.trim().replaceAll(" +", " ");
        String[] str = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = str.length - 1; i >= 0; i--){
            sb.append(str[i] + " ");
        }
        return sb.toString().substring(0, sb.length() - 1);
    }
}