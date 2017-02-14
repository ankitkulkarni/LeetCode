public class Solution {
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while(i < j){
            while(i < j && !isVowel(c[i])){
                i++;
            }
            while(i < j && !isVowel(c[j])){
                j--;
            }
            if(i < j){
                char ch = c[i];
                c[i++] = c[j];
                c[j--] = ch;
            }
        }
        return String.valueOf(c);
    }
    public boolean isVowel(Character c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}




public class Solution {
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while(i < j){
            while(i < j && c[i] != 'a' && c[i] != 'e' && c[i] != 'i' && c[i] != 'o' && c[i] != 'u' && c[i] != 'A' && c[i] != 'E' && c[i] != 'I' && c[i] != 'O' && c[i] != 'U'){
                i++;
            }
            while(i < j && c[j] != 'a' && c[j] != 'e' && c[j] != 'i' && c[j] != 'o' && c[j] != 'u' && c[j] != 'A' && c[j] != 'E' && c[j] != 'I' && c[j] != 'O' && c[j] != 'U'){
                j--;
            }
            if(i < j){
                char ch = c[i];
                c[i++] = c[j];
                c[j--] = ch;
            }
        }
        return String.valueOf(c);
    }
}