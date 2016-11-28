/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        int lengthA = getLengthOfList(headA);
        int lengthB = getLengthOfList(headB);
        ListNode shorterList = lengthA < lengthB ? headA : headB;
        ListNode longerList = lengthA < lengthB ? headB : headA;
        longerList = diffNodeOfLongerList(longerList, Math.abs(lengthA - lengthB));
        while(shorterList != longerList){
            shorterList = shorterList.next;
            longerList = longerList.next;
        }
        return shorterList == null && longerList == null ? null : shorterList;
    }
    
    int getLengthOfList(ListNode node){
        int length = 0;
        while(node != null){
            node = node.next;
            length++;
        }
        return length;
    }
    
    ListNode diffNodeOfLongerList(ListNode list, int k){
        ListNode current = list;
        while(k > 0 && current != null){
            current = current.next;
            k--;
        }
        return current;
    }
}