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
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode t = queue.poll();
                if(t != null){
                    TreeNode temp = t.left;
                    t.left = t.right;
                    t.right = temp;
                    queue.offer(t.left);
                    queue.offer(t.right);
                }
            }
        }
        return root;
    }
}