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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        if(root==null)return list;
        findpos(root,list);
        return list;
    }
    public static void findpos(TreeNode temp,List<Integer>list)
    {
        if(temp==null)return;
        findpos(temp.left,list);
        findpos(temp.right,list);
        list.add(temp.val);
    }
}