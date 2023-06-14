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
    List<Integer> inOrder = new ArrayList<>();
    void inorderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left);
        inOrder.add(node.val);
        inorderTraversal(node.right);
    }
    int getMinimumDifference(TreeNode root) {
       inorderTraversal(root);
       int minDifference = Integer.MAX_VALUE;
       for (int i = 1; i < inOrder.size(); i++) {
            minDifference = Math.min(minDifference, inOrder.get(i) - inOrder.get(i-1));
        }
        return minDifference;
    }
};