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
    public int sumNumbers(TreeNode root) {
      return result(root,0);
        
    }
    public static int result(TreeNode root,int t)
    {
        if(root==null) return 0;
        if(root.left==null && root.right==null) return t*10+root.val;
        return result(root.left,t*10+root.val)+result(root.right,t*10+root.val);
    }
}