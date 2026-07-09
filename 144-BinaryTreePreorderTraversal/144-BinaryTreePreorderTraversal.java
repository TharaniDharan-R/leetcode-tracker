// Last updated: 7/9/2026, 9:50:24 AM
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
    List<Integer> x=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        preorder(root);
        return x;
    }
    void preorder(TreeNode root){
        if(root==null){
            return;
        }
        x.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
}