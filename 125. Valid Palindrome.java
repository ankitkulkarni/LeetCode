public class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while(i < j){
            while(i < j && !Character.isDigit(s.charAt(i)) && !Character.isAlphabetic(s.charAt(i))){
                i++;
            }
            while(i < j && !Character.isDigit(s.charAt(j)) && !Character.isAlphabetic(s.charAt(j))){
                j--;
            }
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}