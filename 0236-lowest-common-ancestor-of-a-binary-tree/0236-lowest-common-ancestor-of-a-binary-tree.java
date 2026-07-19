/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)
        return null;
        if(p==root||q==root)
        return root;
        TreeNode lowestleft=lowestCommonAncestor(root.left,  p, q);
        TreeNode lowestright=lowestCommonAncestor(root.right,  p, q);
        if(lowestleft!=null && lowestright!=null)
        return root;
        if(lowestleft!=null){
        return lowestleft;
        }
        return lowestright;
    }
}