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
        return postOrder(root, new ArrayList<Integer>());
    }
    
    public ArrayList<Integer> postOrder(TreeNode node, ArrayList<Integer> storeOrder){
        if(node != null){
            postOrder(node.left, storeOrder);
            postOrder(node.right, storeOrder);
            storeOrder.add(node.val);
        }
        return storeOrder;
    }
}