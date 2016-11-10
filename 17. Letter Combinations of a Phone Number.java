public class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> result = new LinkedList<>();
        String[] mappingOfDigitsToCharacters = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        if(digits.length() == 0){
            return result;
        }
        result.add("");
        for(int i = 0; i < digits.length(); i++){
            int number = Character.getNumericValue(digits.charAt(i));
            while(result.peek().length() == i){
                String temp = result.remove();
                for(char c: mappingOfDigitsToCharacters[number].toCharArray()){
                    result.add(temp + c);
                }
            }
        }
        return result;
    }
}