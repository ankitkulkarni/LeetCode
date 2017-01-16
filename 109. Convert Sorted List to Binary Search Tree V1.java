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
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        List<ListNode> list = new LinkedList<>();
        while(current.next != null){
            current = current.next;
            list.add(current);
        }
        return listToBST(list, 0, list.size() - 1);
    }
    TreeNode listToBST(List<ListNode> list, int start, int end){
        if(start > end){
            return null;
        }
        int mid = start + (end - start)/2;
        TreeNode t = new TreeNode(list.get(mid).val);
        t.left = listToBST(list, start, mid - 1);
        t.right = listToBST(list, mid + 1, end);
        return t;
    }
}