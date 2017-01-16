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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null){
            return false;
        }
        Deque<TreeNode> stack = new LinkedList<>();
        Deque<Integer> sumStack = new LinkedList<>();
        stack.offerFirst(root);
        sumStack.offerFirst(root.val);
        while(!stack.isEmpty()){
            TreeNode t = stack.poll();
            int temp = sumStack.poll();
            if(temp == sum && t.left == null && t.right == null){
                return true;
            }
            if(t.right != null){
                stack.offerFirst(t.right);
                sumStack.offerFirst(temp + t.right.val);
            }
            if(t.left != null){
                stack.offerFirst(t.left);
                sumStack.offerFirst(temp + t.left.val);
            }
        }
        return false;
    }
}