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
    ArrayList<String> list = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {

        if (root == null)
            return list;
        dfs(root, "", list);
        return list;

    }

    private void dfs(TreeNode root, String path, ArrayList<String> list) {

        path += root.val;

        if (root.left == null && root.right == null) {
            list.add(path);
            return;
        }
        if (root.left != null) {
            dfs(root.left, path + "->", list);
        }
        if (root.right != null) {
            dfs(root.right, path + "->", list);
        }

    }
}