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
    public int minDiffInBST(TreeNode root) {
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
            return root.val;
        }
        ArrayList<Integer>list = new ArrayList<>();
        inOrder(root, list);
        int min = Integer.MAX_VALUE;
        for(int i=1;i<list.size();i++) {
            if(list.get(i) - list.get(i-1) < min) {
                min = list.get(i) - list.get(i-1);
            }
        }
        return min;
    }
    void inOrder(TreeNode root, ArrayList<Integer>list) {
        if(root == null) {
            return;
        }
        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);
    }
}