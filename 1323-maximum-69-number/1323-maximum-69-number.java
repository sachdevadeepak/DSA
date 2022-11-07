class Solution
{
    public int maximum69Number (int num)
    {
        StringBuilder sb = new StringBuilder();
        while(num != 0)
        {
            sb.append(num % 10);
            num /= 10;
        }
        StringBuilder res = new StringBuilder();
        boolean converted = false;
        sb.reverse();
        for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i) == '6' && converted == false)
            {
                res.append('9');
                converted = true;
            }
            else
            {
                res.append(sb.charAt(i));
            }
        }
        return Integer.parseInt(res.toString());
    }
}