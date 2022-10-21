class Solution
{
    public boolean containsNearbyDuplicate(int[] nums, int k)
    {
        int n = nums.length;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<=Math.min(k,n-1);i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
            if(map.get(nums[i]) > 1)
            {
                return true;
            }
        }
        for(int i=k+1;i<n;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
            map.put(nums[i-k-1],map.getOrDefault(nums[i-k-1],0) - 1);
            if(map.get(nums[i]) > 1)
            {
                return true;
            }
        }
        return false;
    }
}