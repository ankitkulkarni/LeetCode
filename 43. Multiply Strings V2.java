public class Solution {
    public String multiply(String num1, String num2) {
        int[] storingMul = new int[num1.length() + num2.length()];
        for(int i = num1.length()-1; i >= 0; i--){
            for(int j = num2.length()-1; j >= 0; j--){
                int mul = ((num1.charAt(i) - '0') * (num2.charAt(j) - '0'));
                int p1 = i + j;
                int p2 = i + j + 1;
                int sum = mul + storingMul[p2];
                storingMul[p1] += sum / 10;
                storingMul[p2] = sum % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i : storingMul){
            if(!(sb.length() == 0 && i == 0)){
                sb.append(i);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}