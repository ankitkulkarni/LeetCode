public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < magazine.length(); i++){
            if(!map.containsKey(magazine.charAt(i))){
                map.put(magazine.charAt(i), 1);
            }
            else{
                int count = map.get(magazine.charAt(i));
                map.put(magazine.charAt(i), ++count);
            }
        }
        for(int i = 0; i < ransomNote.length(); i++){
            if(!map.containsKey(ransomNote.charAt(i))){
                return false;
            }
            else{
                int num = map.get(ransomNote.charAt(i));
                if(num == 0){
                    return false;
                }
                else{
                    map.put(ransomNote.charAt(i), --num);
                }
            }
        }
        return true;
    }
}