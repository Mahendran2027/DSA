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
        compare(root,list);
        return list;
    }
    public static void compare(TreeNode tree,List<Integer>list)
    {
        if(tree==null)return;
        list.add(tree.val);
        compare(tree.left,list);
        compare(tree.right,list);

    }
}