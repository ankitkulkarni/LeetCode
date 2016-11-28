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
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode current = root;
        while(current != null || !stack.isEmpty()){
            while(current != null){
                stack.offerFirst(current);
                current = current.left;
            }
            current = stack.pollFirst();
            result.add(current.val);
            current = current.right;
        }
        return result;
    }
}