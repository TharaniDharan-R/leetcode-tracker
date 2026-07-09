// Last updated: 7/9/2026, 9:50:23 AM
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
    public List<Integer> postorderTraversal(TreeNode root) {
        postorder(root);
        return x;
    }
    void postorder(TreeNode root){
        if(root==null)
        return ;
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        x.add(root.val);

    }
}