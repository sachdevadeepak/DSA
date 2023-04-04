class Solution 
{
    public int partitionString(String s) 
    {
        int partition = 0;
        HashSet<Character>set = new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            if(set.contains(s.charAt(i)))
            {
                set.clear();
                set.add(s.charAt(i));
                partition++;
            }
            else
            {
                set.add(s.charAt(i));
            }
        }
        return partition+1;
    }
}