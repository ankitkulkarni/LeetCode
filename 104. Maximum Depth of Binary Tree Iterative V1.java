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
        if(root == null){
            return 0;
        }
        int max = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int count = queue.size();
            for(int i = 0; i < count; i++){
                TreeNode t = queue.poll();
                if(t != null){
                    if(t.left != null){
                        queue.offer(t.left);
                    }
                    if(t.right != null){
                        queue.offer(t.right);
                    }
                }
            }
            max++;
        }
        return max;
    }
}