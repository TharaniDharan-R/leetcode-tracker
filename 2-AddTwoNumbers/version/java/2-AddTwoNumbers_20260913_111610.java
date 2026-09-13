// Last updated: 9/13/2026, 11:16:10 AM
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
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13        ListNode ans =new ListNode();
14        ListNode t1 = l1;
15        ListNode t2 = l2;
16        int sum =0;
17        int c=0;
18        ListNode res= ans;
19        while(t1 != null || t2 != null){
20            sum= c;
21            if(t1 !=null){
22                sum +=t1.val;
23            t1=t1.next;
24            }
25            if(t2 != null){
26                sum+=t2.val;
27            t2= t2.next;
28            }
29            ListNode n=new ListNode(sum%10);
30            c=sum/10;
31            res.next=n;
32            res = res.next;
33        }
34        if(c>0){
35            ListNode a= new ListNode(c);
36            res.next= a;
37            res= res.next;
38        }
39        return ans.next;
40    }
41}