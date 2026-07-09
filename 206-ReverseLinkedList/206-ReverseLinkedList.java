// Last updated: 7/9/2026, 9:49:59 AM
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
    public ListNode reverseList(ListNode head) {
       ListNode prev= null,curr=head,next;
       while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr= next;
       }
       return prev;
       

    }
}