class Solution {
    private static int lessThanTarget(int[] nums, int target) {
        int lo = 0, hi = nums.length; 
        while (lo < hi) {
            int mid = lo + (hi - lo)/2; 
            if (nums[mid] < target) lo = mid+1; 
            else hi = mid; 
        }
        return lo; 
    }
    
    public int maximumCount(int[] nums) {
        int neg =  lessThanTarget(nums, 0), pos = nums.length -  lessThanTarget(nums, 1); 
        return Math.max(neg, pos); 
    }
}