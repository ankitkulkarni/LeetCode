public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid.length == 0){
            return 0;
        }
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[][] grid = obstacleGrid;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(obstacleGrid[i][j] == 1){
                    grid[i][j] = 0;
                }
                else if(i == 0 && j == 0){
                    grid[i][j] = 1;
                }
                else if(i == 0){
                    grid[i][j] = grid[i][j - 1];
                }
                else if(j == 0){
                    grid[i][j] = grid[i - 1][j];
                }
                else{
                    grid[i][j] = grid[i][j - 1] + grid[i - 1][j];
                }
            }
        }
        return grid[m - 1][n - 1];
    }
}