// Last updated: 9/15/2026, 10:35:28 AM
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
12    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
13        ListNode ans=new ListNode();
14        ListNode temp= ans;
15        while(list1 !=null && list2 !=null){
16            if(list1.val <list2.val){
17            temp.next=list1;
18            temp=temp.next;
19            list1=list1.next;
20        }
21        else{
22            temp.next=list2;
23            temp=temp.next;
24            list2=list2.next;
25    }
26        }
27        if(list1 !=null){
28            temp.next=list1;
29            temp = temp.next;
30        }
31         if(list2 !=null){
32            temp.next=list2;
33            temp = temp.next;
34        }
35        return ans.next;
36    }
37}