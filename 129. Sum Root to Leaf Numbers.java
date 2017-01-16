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
    public int sumNumbers(TreeNode root) {
        if(root == null){
            return 0;
        }
        int total = 0;
        Deque<TreeNode> stack = new LinkedList<>();
        Deque<Integer> sumStack = new LinkedList<>();
        stack.offerFirst(root);
        sumStack.offerFirst(root.val);
        while(!stack.isEmpty()){
            TreeNode t = stack.poll();
            int value = sumStack.poll();
            if(t.left == null && t.right == null){
                total += value;
            }
            if(t.right != null){
                stack.offerFirst(t.right);
                sumStack.offerFirst(value * 10 + t.right.val);
            }
            if(t.left != null){
                stack.offerFirst(t.left);
                sumStack.offerFirst(value * 10 + t.left.val);
            }
        }
        return total;
    }
}