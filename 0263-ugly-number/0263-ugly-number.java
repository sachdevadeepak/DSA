class Solution 
{
    public boolean isUgly(int n) 
    {
        if(n <= 0)
        {
            return false;
        }
        for(int factor : new int[] {2,3,5})
        {
            n = divideIfDivisible(n,factor);
        }
        return n == 1;
    }
    public int divideIfDivisible(int dividend, int divisor)
    {
        while(dividend % divisor == 0)
        {
            dividend /= divisor;
        }
        return dividend;
    }
}