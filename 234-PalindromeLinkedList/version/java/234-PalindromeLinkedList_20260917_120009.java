// Last updated: 9/17/2026, 12:00:09 PM
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
12    static ListNode rev(ListNode head){
13        ListNode prev= null;
14        ListNode curr= head;
15        while(curr!= null){
16            ListNode next= curr.next;
17            curr.next= prev;
18            prev=curr;
19            curr= next;
20        }
21        return prev;
22    }
23    static ListNode mid(ListNode l){
24        ListNode s=l;
25        ListNode f=l;
26        while(f!=null && f.next!=null){
27            s=s.next;
28            f=f.next.next;
29        }
30        return s;
31    }
32    public boolean isPalindrome(ListNode head) {
33        ListNode s= head;
34        ListNode mid= mid(head);
35        ListNode midrev=rev(mid);
36
37        while(midrev!=null){
38            if(s.val != midrev.val){
39                return false;
40            }
41            s=s.next;
42            midrev=midrev.next;
43
44        }
45      //  System.out.print(midrev.val);
46        return true;
47    }
48}