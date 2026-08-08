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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        if(root==null)return list;
        findpre(root,list);
        return list;
    }
    public static void findpre(TreeNode temp,List<Integer>list)
    {
        if(temp==null)return;
        list.add(temp.val);
        findpre(temp.left,list);
        findpre(temp.right,list);
    }
}