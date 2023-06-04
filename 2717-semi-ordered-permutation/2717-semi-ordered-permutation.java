class Solution {
  public int semiOrderedPermutation(int[] nums) {
    int n = nums.length, min = 0, max = 0;
    for (int i=0; i<n; i++) {
      if (nums[i] == 1) min = i;
      if (nums[i] == n) max = i;
    }
    return min + (n-1-max) - (min > max ? 1 : 0);
  }
}