class Solution
{
    public boolean checkSubarraySum(int[] nums, int k)
    {
        Map<Integer, Integer> hashMap = new HashMap<>(Map.of(0, -1));
        int sum = 0;
        for (int i = 0; i < nums.length; i++) 
        {
            sum += nums[i];
            if (!hashMap.containsKey(sum % k))
                hashMap.put(sum % k, i);
            else if (hashMap.get(sum % k) < i-1)
                return true;
        }
        return false;
    }
}