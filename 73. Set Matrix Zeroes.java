public class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[] rows = new boolean[matrix.length];
        boolean[] cols = new boolean[matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }
        nullifyMatrix(matrix, rows, cols);
    }
    void nullifyMatrix(int[][] matrix, boolean[] rows, boolean[] cols){
        for(int i = 0; i < rows.length; i++){
            if(rows[i]){
                nullifyRow(matrix, i);
            }
        }
        for(int j = 0; j < cols.length; j++){
            if(cols[j]){
                nullifyCol(matrix, j);
            }
        }
    }
    void nullifyRow(int[][] matrix, int i){
        for(int j = 0; j < matrix[0].length; j++){
            matrix[i][j] = 0;
        }
    }
    void nullifyCol(int[][] matrix, int j){
        for(int i = 0; i < matrix.length; i++){
            matrix[i][j] = 0;
        }
    }
}