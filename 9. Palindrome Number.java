public class Solution{
    public boolean isPalindrome(int x){
        if (x < 0){
            return false;
        }
        int reversedNumber = 0;
        int temp = x;
        while (temp != 0){
    	    reversedNumber = (reversedNumber * 10) + (temp % 10);
    	    temp = temp / 10;
        }
        return (x == reversedNumber) ? true : false;
    }
}