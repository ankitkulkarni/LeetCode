public class Solution {
    public String multiply(String num1, String num2) {
        long num11 = convertStrToNum(num1);
        long num22 = convertStrToNum(num2);
        long result = num11 * num22;
        String returnThis = Long.toString(result);
        return returnThis;
    }
    public long convertStrToNum(String str){
        if(str == null){
            return 0;
        }
        long result = 0;
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            int number = c - '0';
            result = (result * 10) + number;
        }
        return result;
    }
}