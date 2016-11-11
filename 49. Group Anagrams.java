public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0){
            return new ArrayList<List<String>>();
        }
        HashMap<String, List<String>> hm = new HashMap<>();
        for(String s : strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String keyString = String.valueOf(c); //String keyString = new String(c);
            if(!hm.containsKey(keyString)){
                hm.put(keyString, new ArrayList<String>());
            }
            hm.get(keyString).add(s);
        }
        for(String key : hm.keySet()){
            Collections.sort(hm.get(key));
        }
        return new ArrayList<List<String>>(hm.values());
    }
}