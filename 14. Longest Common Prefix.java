public class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        if(strs != null && strs.length > 0){
            Arrays.sort(strs);
            for(int i = 0; i < strs[0].length(); i++){
                if(strs[0].charAt(i) == strs[strs.length - 1].charAt(i)){
                    result.append(strs[0].charAt(i));
                }
                else{
                    return result.toString();
                }
            }
        }
        return result.toString();
    }
}