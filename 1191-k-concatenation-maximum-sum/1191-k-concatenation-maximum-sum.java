class Solution {
   public int kConcatenationMaxSum(int[] arr, int k) {
    int L = arr.length;
    int MOD = 1_000_000_007;
    long maxSub = arr[0];
    long maxWhole = arr[0];
    long sum = Arrays.stream(arr).sum();
    int n = L;
    if (k > 1) n = L * 2; 
    for (int i = 1; i < n; i++) { 
        int realIndex = i % L;
        long temp = maxSub + arr[realIndex];
        maxSub = Math.max(temp, arr[realIndex]);
        maxWhole = Math.max(maxWhole, maxSub);
    }
    if (maxWhole < 0) 
        return 0;
    long ret = Math.max(maxWhole, sum * Math.max(0, k - 2) + maxWhole);
    return (int)(ret % MOD);
}
}