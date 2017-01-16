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
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null){
            return result;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            int count = queue.size();
            List<Integer> list = new LinkedList<>();
            for(int i = 0; i < count; i++){
                TreeNode t = queue.poll();
                if(t != null){
                    list.add(t.val);
                    queue.offer(t.left);
                    queue.offer(t.right);
                }
            }
            if(list.size() != 0){
                result.add(new ArrayList<>(list));
            }
        }
        return result;
    }
}