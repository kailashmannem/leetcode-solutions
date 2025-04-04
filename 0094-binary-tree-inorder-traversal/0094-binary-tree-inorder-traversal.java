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
    public List<Integer> inorderTraversal(TreeNode root) {
        var list = new LinkedList<Integer>();
        inorder(list, root);
        return list;
    }

    public void inorder(List<Integer> list, TreeNode root) {
        if (root!=null) {
            inorder(list, root.left);
            list.add(root.val);
            inorder(list, root.right);
        }
    }
}