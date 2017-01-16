public class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        if(m == 1 && n == 1){
            return grid[0][0];
        }
        int[][] minPathGrid = new int[m][n];
        minPathGrid[0][0] = grid[0][0];
        for(int i = 1; i < n; i++){
            minPathGrid[0][i] = minPathGrid[0][i - 1] + grid[0][i];
        }
        for(int i = 1; i < m; i++){
            minPathGrid[i][0] = minPathGrid[i - 1][0] + grid[i][0];
        }
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                minPathGrid[i][j] = grid[i][j] + Math.min(minPathGrid[i - 1][j], minPathGrid[i][j - 1]);
            }
        }
        return minPathGrid[m - 1][n - 1];
    }
}