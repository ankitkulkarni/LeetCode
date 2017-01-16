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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null){
            return result;
        }
        queue.offer(root);
        int level = 0;
        while(!queue.isEmpty()){
            int count = queue.size();
            level++;
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
                if(level % 2 == 0){
                    Collections.reverse(list);
                }
                result.add(new ArrayList<>(list));
            }
        }
        return result;
    }
}