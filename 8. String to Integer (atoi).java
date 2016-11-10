public class Solution {
    public int myAtoi(String str) {
        if(str == null || str.length() == 0){
            return 0;
        }
        double convertedNumber = 0;
        int i = 0, length = str.length(), sign = 1;
        while(i < length && str.charAt(i) == ' '){
            i++;
        }
        if(i < str.length() && (str.charAt(i) == '+' || str.charAt(i) == '-')){
            sign = str.charAt(i++) == '+' ? 1 : -1;
        }
        while(i < length && str.charAt(i) >= '0' && str.charAt(i) <= '9'){
            int digit = str.charAt(i++) - '0';
            convertedNumber = (convertedNumber * 10) + digit;
        }
        convertedNumber = (convertedNumber >= Integer.MAX_VALUE && sign > 0) ? Integer.MAX_VALUE : convertedNumber;
        convertedNumber = (convertedNumber > Integer.MAX_VALUE && sign < 0) ? Integer.MIN_VALUE : sign * convertedNumber;
        return (int)convertedNumber;
    }
}