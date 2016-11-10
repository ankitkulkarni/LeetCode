public class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> list = new ArrayList<>();
        generateP(list, "", 0, 0, n);
        return list;
    }
    public void generateP(ArrayList<String> list, String str, int open, int close, int givenNumber){
        if(open == givenNumber && close == givenNumber){
            list.add(str);
            return;
        }
        if(open < givenNumber){
            generateP(list, str + "(", open + 1, close, givenNumber);
        }
        if(close < open){
            generateP(list, str + ")", open, close + 1, givenNumber);
        }
    }
}