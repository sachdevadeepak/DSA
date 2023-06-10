class Solution {
    public int sumDistance(int[] nums, String s, int d) {
        final int mod = 1000000007;
        for (int i=0; i<nums.length; i++) {
            nums[i] += d * (s.charAt(i) == 'R' ? 1 : -1);
        }
        Arrays.sort(nums);
        long sum = 0;
        int n = nums.length;
        long prefix = 0;
        for (int i=0; i<n; i++) {
            sum += i * (long)nums[i] - prefix;
            sum %= mod;
            prefix += nums[i];
        }   
        return (int)sum ;
    }
}