public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(target > matrix[matrix.length - 1][matrix[0].length - 1] || target < matrix[0][0]){
            return false;
        }
        int start = 0, end = matrix[0].length - 1;
        for(int i = 0; i < matrix.length; i++){
            if(target > matrix[i][matrix[0].length - 1]){
                continue;
            }
            if(target < matrix[i][0]){
                return false;
            }
            while(start <= end){
                int mid = start + (end - start)/2;
                if(matrix[i][mid] == target){
                    return true;
                }
                else if(target > matrix[i][mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            start = 0;
            end = matrix[0].length - 1;
        }
        return false;
    }
}