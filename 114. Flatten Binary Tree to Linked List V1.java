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
    public void flatten(TreeNode root) {
        flattenNode(root, null);
    }
    public TreeNode flattenNode(TreeNode n, TreeNode prev){
        if(n == null){
            return prev;
        }
        prev = flattenNode(n.right, prev);
        prev = flattenNode(n.left, prev);
        n.right = prev;
        n.left = null;
        prev = n;
        return prev;
    }
}