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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        routes(result, "", root);
        return result;
    }

    public void routes(List<String> res, String s, TreeNode root) {
        if (root.left == null && root.right == null) {
            if (s == "") res.add(String.valueOf(root.val));
            else res.add(s + "->" + root.val);
        }
        if (root.left!=null) {
            if (s == "") {
                routes(res, String.valueOf(root.val), root.left);
            }
            else {
                routes(res, s + "->" + root.val, root.left);
            }
        }
        if (root.right!=null) {
            if (s == "") {
                routes(res, String.valueOf(root.val), root.right);
            }
            else {
                routes(res, s + "->" + root.val, root.right);
            }
        }
    }
}