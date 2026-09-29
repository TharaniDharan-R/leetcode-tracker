// Last updated: 9/29/2026, 11:13:51 PM
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
17    public List<Integer> preorderTraversal(TreeNode root) {
18        List <Integer>al= new ArrayList<>();
19        preorder(root,al);
20        return al;
21    }
22         void preorder(TreeNode root , List <Integer>al){
23        if(root == null){
24            return ;
25        }
26        al.add(root.val);
27        preorder(root.left,al);
28        preorder(root.right,al);
29        }
30    
31}