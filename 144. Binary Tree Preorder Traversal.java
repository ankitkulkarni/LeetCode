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
    public List<Integer> preorderTraversal(TreeNode root) {
        return preorder(root, new ArrayList<Integer>());
    }
    public ArrayList<Integer> preorder(TreeNode node, ArrayList<Integer> storeOrder){
        if(node != null){
            storeOrder.add(node.val);
            preorder(node.left, storeOrder);
            preorder(node.right, storeOrder);
        }
        return storeOrder;
    }
}