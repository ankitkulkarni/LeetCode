public class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1, j = num2.length() - 1, sum = 0, carry = 0;
        while(i >= 0 || j >= 0){
            if(j < 0){
                while(i >= 0){
                    sum += carry + (num1.charAt(i--) - '0');
                    carry = sum / 10;
                    sb.append(sum % 10);
                    sum = 0;
                }
            }
            if(i < 0){
                while(j >= 0){
                    sum = carry + (num2.charAt(j--) - '0');
                    carry = sum / 10;
                    sb.append(sum % 10);
                    sum = 0;
                }
            }
            if(i >= 0 && j >= 0){
                sum += carry + (num1.charAt(i--) - '0') + (num2.charAt(j--) - '0');
                carry = sum / 10;
                sb.append(sum % 10);
                sum = 0;
            }
        }
        if(carry == 1){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}




public class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1, j = num2.length() - 1, carry = 0;
        while(i >= 0 || j >= 0){
            if(j < 0){
                while(i >= 0){
                    carry += num1.charAt(i--) - '0';
                    sb.append(carry % 10);
                    carry /= 10;
                }
            }
            if(i < 0){
                while(j >= 0){
                    carry += num2.charAt(j--) - '0';
                    sb.append(carry % 10);
                    carry /= 10;
                }
            }
            if(i >= 0 && j >= 0){
                carry += (num1.charAt(i--) - '0') + (num2.charAt(j--) - '0');
                sb.append(carry % 10);
                carry /= 10;
            }
        }
        if(carry == 1){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}