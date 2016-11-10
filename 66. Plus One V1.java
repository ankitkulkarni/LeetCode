public class Solution {
    public int[] plusOne(int[] digits) {
        if(digits[digits.length - 1] != 9){
            digits[digits.length - 1] += 1;
            return digits;
        }
        else{
            int i = digits.length - 1;
            while(i > 0){
                if(digits[i] == 9){
                    digits[i] = 0;
                    i--;
                }
                else{
                    break;
                }
            }
            if(i == 0 && digits[0] == 9){
                int[] arr = new int[digits.length + 1];
                arr[0] = 1;
                arr[1] = 0;
                return arr;
            }
            else{
                digits[i] += 1;
                return digits;
            }
        }
    }
}