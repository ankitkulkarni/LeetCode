/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy.next;
        ListNode second = dummy.next;
        while(second != null){
            while(second.next != null && second.next.val == second.val){
                second = second.next;
            }
            first.next = second.next;
            first = first.next;
            second = second.next;
        }
        return dummy.next;
    }
}