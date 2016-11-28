/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        return dfsBalanced(root) != -1; 
    }
    
    public int dfsBalanced(TreeNode node){
        if(node == null){
            return 0;
        }
        int leftHeight = dfsBalanced(node.left);
        if(leftHeight == -1){
            return -1;
        }
        int rightHeight = dfsBalanced(node.right);
        if(rightHeight == -1){
            return -1;
        }
        return Math.abs(leftHeight - rightHeight) > 1 ? -1 : 1 + Math.max(leftHeight, rightHeight);
    }
}