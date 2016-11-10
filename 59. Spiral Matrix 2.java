public class Solution {
    public int[][] generateMatrix(int n) {
        int i = 1;
        int[][] matrix = new int[n][n];
        if(n == 0){
            return matrix;
        }
        if(n == 1){
            matrix[0][0] = 1;
            return matrix;
        }
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = n - 1;
        while(rowStart <= rowEnd && colStart <= colEnd){
            for(int j = colStart; j <= colEnd; j++){
                matrix[rowStart][j] = i++;
            }
            rowStart++;
            for(int j = rowStart; j <= rowEnd; j++){
                matrix[j][colEnd] = i++;
            }
            colEnd--;
            if(rowStart <= rowEnd){
                for(int j = colEnd; j >= colStart; j--){
                    matrix[rowEnd][j] = i++;
                }
            }
            rowEnd--;
            if(colStart <= colEnd){
                for(int j = rowEnd; j >= rowStart; j--){
                    matrix[j][colStart] = i++;
                }
            }
            colStart++;
        }
        return matrix;
    }
}