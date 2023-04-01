class Solution {
    public int maximumCount(int[] nums) {
        int count = 0;
        int i = 0;
        for(i=0;i<nums.length;i++) {
            if(nums[i] > 0) {
                break;
            }
            else if(nums[i] < 0) {
                count++;
            }
        }
        return Math.max(count, nums.length - i);
    }
}