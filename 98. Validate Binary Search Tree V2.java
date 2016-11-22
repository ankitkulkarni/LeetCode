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
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    public boolean isValidBST(TreeNode node, long min, long max){
        if(node == null){
            return true;
        }
        if(node.val >= max || node.val <= min){
            return false;
        }
        else{
            boolean checkLeft = isValidBST(node.left, min, node.val);
            if(!checkLeft){
                return false;
            }
            boolean checkRight = isValidBST(node.right, node.val, max);
            return checkRight;
        }
    }
}