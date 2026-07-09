// Last updated: 7/9/2026, 9:50:37 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer>a=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
       inorder(root);
       return a;
    }
    void inorder(TreeNode root){
     if(root == null){
        return ;
    }
        inorderTraversal(root.left);
        a.add(root.val);
        inorderTraversal(root.right);
    }
}