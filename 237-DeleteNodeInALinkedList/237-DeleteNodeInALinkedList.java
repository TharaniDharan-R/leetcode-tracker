// Last updated: 7/9/2026, 9:49:54 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode Node) {
        int a=Node.next.val;
        Node.val=a;
        Node.next=Node.next.next;
        
    }
}