// Last updated: 7/9/2026, 9:47:34 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode fast= head;
        ListNode slow = head;
        ListNode temp= head;
        if(head== null || head.next== null){
            return null;
        }
        while(fast != null && fast.next!=null){
            fast=fast.next.next;
            temp= slow;
            slow = slow.next;
        }

        temp.next =slow.next;
        return head;
    }
}