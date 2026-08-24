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
    public int sumOfLeftLeaves(TreeNode root) {
       
      return sumleft(root);
     
    }
    public static int sumleft(TreeNode here)
    {

        int find=0;
        if(here==null)return 0;
       if(here.left!=null&&here.left.left==null&&here.left.right==null) 
      {
        find+=here.left.val;
      }
     find+=sumleft(here.right);
     find+=sumleft(here.left);
     return find;
         
    }
}