// Last updated: 9/30/2026, 9:35:31 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<Integer> postorderTraversal(TreeNode root) {
18        ArrayList<Integer> al= new ArrayList<>();
19         postorder(root,al);
20         return al;
21    }
22    public void postorder(TreeNode root , List<Integer>al){
23        if(root== null){
24            return;
25        }
26        postorder(root.left,al);
27        postorder(root.right,al);
28        al.add(root.val);
29    }
30}