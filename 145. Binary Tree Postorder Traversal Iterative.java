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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        while(root != null || !stack.isEmpty()){
            if(root != null){
                stack.offerFirst(root);
                result.add(root.val);
                root = root.right;
            }
            else{
                root = stack.pop().left;
            }
        }
        Collections.reverse(result);
        return result;
    }
}