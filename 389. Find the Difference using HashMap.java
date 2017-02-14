public class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), 1);
            }
            else{
                count = map.get(s.charAt(i));
                map.put(s.charAt(i), ++count);
            }
        }
        for(int i = 0; i < t.length(); i++){
            if(!map.containsKey(t.charAt(i))){
                return t.charAt(i);
            }
            else{
                count = map.get(t.charAt(i));
                if(count == 0){
                    return t.charAt(i);
                }
                else{
                    map.put(t.charAt(i), --count);
                }
            }
        }
        for(char c : map.keySet()){
            if(map.get(c) > 0){
                return c;
            }
        }
        return 'a';
    }
}