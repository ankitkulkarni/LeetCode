public class Solution {
    public void rotate(int[][] matrix) {
        int length = matrix.length;
        for(int layer = 0; layer < length/2; layer++){
            int last = length - layer - 1;
            for(int i = layer; i < last; i++){
                int offset = i - layer;
                int temp = matrix[layer][i];
                matrix[layer][i] = matrix[last - offset][layer];
                matrix[last - offset][layer] = matrix[last][last - offset];
                matrix[last][last - offset] = matrix[i][last];
                matrix[i][last] = temp;
            }
        }
    }
}