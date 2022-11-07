class Solution 
{
    int sum(long n)
    {
        int sum = 0;
        while(n != 0)
        {
            sum += (n % 10);
            n = n / 10;
        }
        return sum;
    }
    public long makeIntegerBeautiful(long n, int target)
    {
        long factor = 1;
        long min = 0;
        while(sum(n) > target)
        {
            min += (factor) * (10 - (n % 10));
            n = (n/10) + 1;
            factor *= 10;
        }
        return min;
    }
}