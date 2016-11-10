public class Solution {
    public int reverse(int x) {
        int result = 0;
        while(x != 0){
            int lastDigit = x % 10;
            int value = (result * 10) + lastDigit;
            if((value - lastDigit)/ 10 != result){
                return 0;
            }
            result = value;
            x = x / 10;
        }
        return result;
    }
}