// Last updated: 9/15/2026, 9:49:33 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public static ListNode InsertBig(ListNode head,ListNode n){
13        n.next= head;
14        return n;
15    }
16    public ListNode reverseList(ListNode head) {
17        ListNode n=null;
18        ListNode temp = head;
19        while(temp!=null){
20            ListNode nn=new  ListNode(temp.val);
21            n=InsertBig(n,nn);
22            temp = temp.next;
23        }
24        return n;
25    }
26}