/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return null;
        }
        if(k == 0 || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode runner = dummy;
        ListNode current = dummy;
        int i = 0;
        while(runner.next != null){
            runner = runner.next;
            i++;
        }
        for(int j = i - (k % i); j > 0; j--){
            current = current.next;
        }
        runner.next = dummy.next;
        dummy.next = current.next;
        current.next = null;
        return dummy.next;
    }
}