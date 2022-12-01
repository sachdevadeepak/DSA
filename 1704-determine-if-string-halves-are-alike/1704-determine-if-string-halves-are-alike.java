class Solution 
{
    public boolean halvesAreAlike(String s)
    {
        HashSet<Character>set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        int count1 = 0, count2 = 0;
        int n = s.length();
        for(int i=0;i<n/2;i++)
        {
            if(set.contains(s.charAt(i)))
                count1++;
            if(set.contains(s.charAt(n-i-1)))
                count2++;
        }
        return count1 == count2;
    }
}