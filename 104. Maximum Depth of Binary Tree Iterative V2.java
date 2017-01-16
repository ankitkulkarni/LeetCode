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
    public int maxDepth(TreeNode root) {
        Deque<TreeNode> stack = new LinkedList<>();
        Deque<Integer> max = new LinkedList<>();
        if(root == null){
            return 0;
        }
        stack.offer(root);
        max.offer(1);
        int maxLen = 0;
        while(!stack.isEmpty()){
            int count = stack.size();
            for(int i = 0; i < count; i++){
                int temp = max.poll();
                TreeNode t = stack.poll();
                maxLen = Math.max(maxLen, temp);
                if(t.right != null){
                    stack.offerFirst(t.right);
                    max.offerFirst(temp + 1);
                }
                if(t.left != null){
                    stack.offerFirst(t.left);
                    max.offerFirst(temp + 1);
                }
            }
        }
        return maxLen;
    }
}