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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        stack.offerFirst(root);
        while(!stack.isEmpty()){
            TreeNode current = stack.pollFirst();
            if(current != null){
                result.add(current.val);
                stack.offerFirst(current.right);
                stack.offerFirst(current.left);
            }
        }
        return result;
    }
}