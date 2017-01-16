/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void reorderList(ListNode head) {
        if(head == null){
            return;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy, fast = dummy;
        while(fast != null  && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode ln = slow, current = slow.next, previous = null;
        while(ln.next != null){
            ln.next = current.next;
            current.next = previous;
            previous = current;
            current = ln.next;
        }
        ln.next = previous;
        slow = head;
        while(slow != ln){
            current = ln.next;
            ln.next = current.next;
            current.next = slow.next;
            slow.next = current;
            slow = slow.next.next;
        }
    }
}