/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = head;
        ListNode previous = null;
        while(current != null){
            dummy.next = current.next;
            current.next = previous;
            previous = current;
            current = dummy.next;
        }
        return previous;
    }
}