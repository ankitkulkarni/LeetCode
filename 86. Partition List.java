/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head == null){
            return null;
        }
        ListNode dummy1 = new ListNode(0), dummy2 = new ListNode(0);
        ListNode curr1 = dummy1, curr2 = dummy2, pointer = head;
        while(pointer != null){
            if(pointer.val < x){
                curr1.next = pointer;
                curr1 = curr1.next;
            }
            else{
                curr2.next = pointer;
                curr2 = curr2.next;
            }
            pointer = pointer.next;
        }
        curr2.next = null;
        curr1.next = dummy2.next;
        return dummy1.next;
    }
}