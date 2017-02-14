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
    public TreeNode invertTree(TreeNode root) {
        Deque<TreeNode> stack = new LinkedList<>();
        stack.offerFirst(root);
        while(!stack.isEmpty()){
            TreeNode t = stack.poll();
            if(t != null){
                TreeNode temp = t.left;
                t.left = t.right;
                t.right = temp;
                stack.offerFirst(t.right);
                stack.offerFirst(t.left);
            }
        }
        return root;
    }
}