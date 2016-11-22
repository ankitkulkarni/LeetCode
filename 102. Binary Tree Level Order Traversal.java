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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null){
            return result;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            ArrayList<Integer> sublist = new ArrayList<>();
            int numberOfNodesInQueue = queue.size();
            for(int i = 0; i < numberOfNodesInQueue; i++){
                if(queue.peek().left != null){
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right != null){
                    queue.offer(queue.peek().right);
                }
                sublist.add(queue.poll().val);
            }
            result.add(sublist);
        }
        return result;
    }
}