class Solution {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int max = 0;
        for (Node child : root.children) { 
            int value = maxDepth(child);
            if (value > max) {
                max = value;
            }
        }
        return max +1;
    }
}