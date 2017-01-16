public class Solution {
    public int maxProduct(int[] nums) {
        int totalProduct = Integer.MIN_VALUE, currentProduct = 1;
        for(int i = 0; i < nums.length; i++){
            currentProduct = 1;
            for(int j = i; j < nums.length; j++){
                if(currentProduct == 0){
                    break;
                }
                currentProduct *= nums[j];
                totalProduct = Math.max(currentProduct, totalProduct);
            }
        }
        return totalProduct < currentProduct ? currentProduct : totalProduct;
    }
}