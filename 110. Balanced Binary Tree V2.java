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
        return root == null ? true : Math.abs(getDepth(root.left) - getDepth(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right); 
    }
    
    public int getDepth(TreeNode node){
        return node == null ? 0 : 1 + Math.max(getDepth(node.left), getDepth(node.right));
    }
}