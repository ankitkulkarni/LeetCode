public class Solution {
    public int maxArea(int[] height) {
        int maximumArea = 0, i = 0, j = height.length - 1;
        while(i < j){
            maximumArea = Math.max(maximumArea, Math.min(height[i], height[j]) * (j - i));
            if(height[i] > height[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return maximumArea;
    }
}