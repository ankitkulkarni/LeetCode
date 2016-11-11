public class Solution {
    public String longestPalindrome(String s) {
        String palindrome = "";
        for(int i = 0; i < s.length(); i++){
            String temp1 = checkOnBothSides(s, i, i);
            if(temp1.length() > palindrome.length()){
                palindrome = temp1;
            }
            String temp2 = checkOnBothSides(s, i, i + 1);
            if(temp2.length() > palindrome.length()){
                palindrome = temp2;
            }
        }
        return palindrome;
    }
    public String checkOnBothSides(String str, int start, int end){
        while(start >= 0 && end <= str.length() - 1 && str.charAt(start) == str.charAt(end)){
            start--;
            end++;
        }
        return str.substring(start + 1, end);
    }
}