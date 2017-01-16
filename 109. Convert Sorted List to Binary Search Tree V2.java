/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null){
            return null;
        }
        return listToBST(head, null);
    }
    TreeNode listToBST(ListNode start, ListNode end){
        if(start == end){
            return null;
        }
        ListNode slow = start, fast = start;
        while(fast != end && fast.next != end){
            fast = fast.next.next;
            slow = slow.next;
        }
        TreeNode t = new TreeNode(slow.val);
        t.left = listToBST(start, slow);
        t.right = listToBST(slow.next, end);
        return t;
    }
}