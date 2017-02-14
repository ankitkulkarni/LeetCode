public class Solution {
    public boolean isSubsequence(String s, String t) {
        int slen = s.length(), tlen = t.length(), i, j;
        for(i = 0, j = 0; i < slen && j < tlen; i++, j++){
            if(s.charAt(i) != t.charAt(j)){
                while(j < tlen && s.charAt(i) != t.charAt(j)){
                    j++;
                }
                if(j >= tlen){
                    return false;
                }
            }
        }
        return i >= slen ? true : false;
    }
}