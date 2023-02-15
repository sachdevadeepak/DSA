class Solution {
     public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> ans = new LinkedList<>();
        for (int i = A.length - 1; i >= 0; --i) {
            ans.add((A[i] + K) % 10);
            K = (A[i] + K) / 10;
        }
        while (K > 0) {
            ans.add(K % 10);
            K /= 10;
        }
        Collections.reverse(ans);
        return ans;
    }
}