class Solution 
{
    public int minEatingSpeed(int[] piles, int h) 
    {
        int r = 0;
        int n = piles.length;
        for(int i=0;i<n;i++)
        {
            r = Math.max(r, piles[i]);
        }
        int l = 1;
        while(l < r)
        {
            int mid = l + (r - l) / 2;
            if(isPossible(piles, mid, n, h))
            {
                r = mid;
            }
            else
            {
                l = mid + 1;
            }
        }
        return l;
    }
    public boolean isPossible(int[] piles, int val, int len, int hours)
    {
        int count = 0;
        for(int i=len-1;i>=0;i--)
        {
            count += (int)Math.ceil((double)piles[i] / val);
            if(count > hours)
            {
                return false;
            }
        }
        return true;
    }
}