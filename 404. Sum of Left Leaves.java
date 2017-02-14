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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null){
            return 0;
        }
        int sum = 0;
        Deque<TreeNode> stack = new LinkedList<>();
        stack.offerFirst(root);
        while(!stack.isEmpty()){
            TreeNode t = stack.poll();
            if(t.right != null){
                stack.offerFirst(t.right);
            }
            if(t.left != null){
                stack.offerFirst(t.left);
                if(t.left.left == null && t.left.right == null){
                    sum += t.left.val;
                }
            }
        }
        return sum;
    }
}