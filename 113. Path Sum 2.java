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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        Deque<Integer> sumStack = new LinkedList<>();
        Deque<List<Integer>> listStack = new LinkedList<>();
        Deque<TreeNode> dfsStack = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if(root != null){
            dfsStack.offerFirst(root);
            sumStack.offerFirst(root.val);
            list.add(root.val);
            listStack.offerFirst(list);
        }
        while(!dfsStack.isEmpty()){
            TreeNode t = dfsStack.poll();
            list = new ArrayList<>(listStack.poll());
            List<Integer> list2 = new ArrayList<>(list);
            int sumAtLevel = sumStack.poll();
            if(t != null){
                if(t.left == null && t.right == null && sumAtLevel == sum){
                    result.add(list);
                }
                if(t.right != null){
                    dfsStack.offerFirst(t.right);
                    int val = t.right.val;
                    list.add(val);
                    listStack.offerFirst(list);
                    sumStack.offerFirst(sumAtLevel + val);
                }
                if(t.left != null){
                    dfsStack.offerFirst(t.left);
                    int val = t.left.val;
                    list2.add(val);
                    listStack.offerFirst(list2);
                    sumStack.offerFirst(sumAtLevel + val);
                }
            }
        }
        return result;
    }
}