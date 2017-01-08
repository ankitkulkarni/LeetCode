public class Solution {
    public int minPathSum(int[][] grid) {
        if(grid.length == 1 && grid[0].length == 1){
            return grid[0][0];
        }
        int[][] minPathGrid = new int[grid.length][grid[0].length];
        minPathGrid[0][0] = grid[0][0];
        for(int i = 1; i < minPathGrid[0].length; i++){
            minPathGrid[0][i] = minPathGrid[0][i - 1] + grid[0][i];
        }
        for(int i = 1; i < minPathGrid.length; i++){
            minPathGrid[i][0] = minPathGrid[i - 1][0] + grid[i][0];
        }
        for(int i = 1; i < minPathGrid.length; i++){
            for(int j = 1; j < minPathGrid[0].length; j++){
                minPathGrid[i][j] = grid[i][j] + Math.min(minPathGrid[i - 1][j], minPathGrid[i][j - 1]);
            }
        }
        return minPathGrid[minPathGrid.length - 1][minPathGrid[0].length - 1];
    }
}