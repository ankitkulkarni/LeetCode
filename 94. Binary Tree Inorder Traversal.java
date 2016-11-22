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
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        return (inorder(root, new ArrayList<Integer>()));
    }
    public ArrayList<Integer> inorder(TreeNode node, ArrayList<Integer> storeOrder){
        if(node != null){
            inorder(node.left, storeOrder);
            storeOrder.add(node.val);
            inorder(node.right, storeOrder);
        }
        return storeOrder;
    }
}