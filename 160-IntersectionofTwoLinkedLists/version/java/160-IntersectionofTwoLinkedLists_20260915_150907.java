// Last updated: 9/15/2026, 3:09:07 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
14        ListNode t1= headA;
15        ListNode t2= headB;
16        while(t1!=t2){
17            if(t1==null){
18                t1=headB;
19            }
20            else{
21                t1=t1.next;
22            }
23            if(t2==null){
24                t2=headA;
25            }
26            else{
27                t2=t2.next;
28            }
29            
30        }
31        return t1;
32
33    }
34}