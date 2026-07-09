// Last updated: 7/9/2026, 9:50:15 AM
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
 ListNode pointerA = headA;
 ListNode pointerB = headB;

 while (pointerA != pointerB) {
     pointerA = (pointerA == null) ? headB : pointerA.next;
     pointerB = (pointerB == null) ? headA : pointerB.next;
 }


 return pointerA;
    }
}