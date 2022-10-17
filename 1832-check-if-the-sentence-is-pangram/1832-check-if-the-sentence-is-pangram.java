class Solution 
{
    public boolean checkIfPangram(String sentence)
    {
        HashSet<Character>unique = new HashSet<>();
        for(int i=0;i<sentence.length();i++)
        {
            unique.add(sentence.charAt(i));
        }
        return unique.size() == 26;
    }
}