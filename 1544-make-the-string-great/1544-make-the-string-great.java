class Solution 
{
    public String makeGood(String s)
    {
        Stack<Character>st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(st.isEmpty())
            {
                st.push(s.charAt(i));
            }
            else if((st.peek() + 32 == s.charAt(i)) || (st.peek() - 32 == s.charAt(i)))
            {
                st.pop();
            }
            else
            {
                st.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty())
        {
            sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}