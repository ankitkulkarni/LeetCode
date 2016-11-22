/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        for(int i = 0; i < m - 1; i++){
            first = first.next;
        }
        ListNode current = first.next;
        ListNode last = current.next;
        for(int i = 0; i < n - m; i++){
            current.next = last.next;
            last.next = first.next;
            first.next = last;
            last = current.next;
        }
        return dummy.next;
    }
}