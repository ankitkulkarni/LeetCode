public class Solution {
    public String longestPalindrome(String s) {
        String temporaryString = "";
        for(int i = 0; i < s.length(); i++){
            String string = checkOnBothSides(s, i, i);
            if(string.length() > temporaryString.length()){
                temporaryString = string;
            }
            String string2 = checkOnBothSides(s, i, i + 1);
            if(string2.length() > temporaryString.length()){
                temporaryString = string2;
            }
        }
        return temporaryString;
    }
    public String checkOnBothSides(String str, int start, int end){
        while(start >= 0 && end <= str.length() - 1 && str.charAt(start) == str.charAt(end)){
            start--;
            end++;
        }
        return str.substring(start + 1, end);
    }
}