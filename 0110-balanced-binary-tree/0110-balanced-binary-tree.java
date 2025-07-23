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
    public boolean isBalanced(TreeNode root) {
        if (root!=null) {
            if (!isBalanced(root.left)) return false;
            if (Math.abs(height(root.left) - height(root.right)) > 1) return false;
            if (!isBalanced(root.right)) return false;
        }
        return true;
    }

    private int height(TreeNode root) {
        if (root == null) return -1;
        return Math.max(height(root.left),height(root.right)) + 1;
    }
}