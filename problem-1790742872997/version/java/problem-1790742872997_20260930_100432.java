// Last updated: 9/30/2026, 10:04:32 AM
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
17    
18    public int maxDepth(TreeNode root) {
19        int depth=0;
20        if(root == null){
21            return depth; 
22        }
23        Queue <TreeNode> queue = new LinkedList<>();
24        queue.add(root);
25        while(!queue.isEmpty()){
26        int size = queue.size();
27        for(int i=0;i<size;i++){
28           TreeNode current =queue.poll();
29            if(current.left!=null){
30                queue.add(current.left);
31            }
32            if(current.right != null){
33                queue.add(current.right);
34            }
35        }
36        depth++;
37        }
38        return depth;
39    }
40
41        
42    
43}