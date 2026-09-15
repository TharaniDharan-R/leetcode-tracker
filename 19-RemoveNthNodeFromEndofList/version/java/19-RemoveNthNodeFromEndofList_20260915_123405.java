// Last updated: 9/15/2026, 12:34:05 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10
11 class Solution {
12    public static ListNode Reverse(ListNode head){
13        ListNode prev= null;
14        ListNode curr=head;
15        while(curr!=null){
16            ListNode next=curr.next;
17            curr.next= prev;
18            prev= curr;
19            curr= next;
20        }
21        return prev;
22    }
23    public ListNode removeNthFromEnd(ListNode head, int n) {
24         head =Reverse(head);
25        ListNode prev = null;
26        ListNode temp = head;
27        int c=1;
28        while(c<n){
29            prev= temp;
30            temp=temp.next;
31            c++;
32        }
33        if(prev== null){
34            head=temp.next;
35        }
36        else{
37            prev.next=temp.next;
38        }
39        head=Reverse(head);
40        return head;
41    }
42}
43 */
44class Solution {
45    public ListNode removeNthFromEnd(ListNode head, int n) {
46        ListNode dummy=new ListNode(0);
47        dummy.next=head;
48        ListNode slow=dummy;
49        ListNode fast=dummy;
50        for(int i=0;i<n;i++){
51            fast=fast.next;
52        }
53        while(fast.next!= null){
54            slow=slow.next;
55            fast=fast.next;
56        }
57        if(fast.next==null){
58            slow.next=slow.next.next;
59        }
60        return dummy.next;
61    }
62}