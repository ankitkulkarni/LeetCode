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
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return symmetric(root.left, root.right);
    }
    boolean symmetric(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }
        else if(left != null && right != null){
            return symmetric(left.left, right.right) && (left.val == right.val) && symmetric(left.right, right.left);
        }
        else{
            return false;
        }
    }
}