public class Solution {
    public int divide(int dividend, int divisor) {
        int sign = 1;
        long ldividend = Math.abs((long)dividend);
        long ldivisor = Math.abs((long)divisor);
        if((divisor < 0 && dividend > 0) || (divisor > 0 && dividend < 0)){
            sign = -1;
        }
        if(ldivisor == 0){
            return Integer.MAX_VALUE;
        }
        if((ldividend == 0) || (ldividend < ldivisor)){
            return 0;
        }
        long lans = ldivide(ldividend, ldivisor);
        int answer;
        if(lans > Integer.MAX_VALUE){
            answer = (sign == 1)? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        else{
            answer = (int)(sign * lans);
        }
        return answer;
    }
    public long ldivide(long ldividend, long ldivisor){
        if(ldivisor > ldividend){
            return 0;
        }
        long lsum = ldivisor;
        long multiple = 1;
        while((lsum + lsum) < ldividend){
            lsum += lsum;
            multiple += multiple;
        }
        if(ldivisor == ldividend){
            return multiple;
        }
        else{
            return multiple + ldivide(ldividend - lsum, ldivisor);
        }
    }
}