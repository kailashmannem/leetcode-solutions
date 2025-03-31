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
        List<Integer> pre = new ArrayList<>();
        preOrder(root,pre);
        return pre;
    }

    public void preOrder(TreeNode root, List<Integer> pre) {
        if (root!=null) {
            pre.add(root.val);
            preOrder(root.left,pre);
            preOrder(root.right,pre);
        }
    }
}