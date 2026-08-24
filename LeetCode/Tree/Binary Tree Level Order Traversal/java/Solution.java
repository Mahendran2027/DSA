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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>list=new ArrayList<>();
       
      find(root,0,list);
      return list;
    }
    public static void find(TreeNode temp,int start,List<List<Integer>>list)
    {
        if(temp==null)
        {
            return;        
        }
      if(list.size()==start)
      {
        list.add(new ArrayList<>());
      }
      list.get(start).add(temp.val);
       find(temp.left,start+1,list);
       find(temp.right,start+1,list);
    }
}