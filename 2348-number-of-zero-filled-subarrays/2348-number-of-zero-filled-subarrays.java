class Solution 
{
    public long zeroFilledSubarray(int[] nums)
    {
        long res = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == 0)
                count++;
            else
            {
                res += ((long)count * (long)(count+1)) / 2;
                count = 0;
            }
        }
        res += ((long)count * (long)(count+1)) / 2;
        return res;
    }
}