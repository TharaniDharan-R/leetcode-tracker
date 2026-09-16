// Last updated: 9/16/2026, 4:20:04 PM
1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode detectCycle(ListNode head) {
14        ListNode s= head;
15        ListNode f= head;
16        while(f!=null &&f.next!=null){
17            s=s.next;
18            f=f.next.next;
19            if(f==s){
20                ListNode p = head;
21                while(p!=s){
22                    p=p.next;
23                    s=s.next;
24                }
25                return p;
26            }
27        }
28        return null;
29        
30
31    }
32}