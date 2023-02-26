class Solution 
{
    public int minDistance(String word1, String word2)
    {
        int[][] memo = new int[word1.length()+1][word2.length()+1];
        for(int[] m : memo)
        {
            Arrays.fill(m,-1);
        }
        return minDistanceUtil(word1,word2,word1.length(), word2.length(), memo);
    }
    public int minDistanceUtil(String s1, String s2, int l1, int l2,int[][] memo)
    {
        if(l1 == 0)
            return l2;
        if(l2 == 0)
            return l1;
        if(memo[l1][l2] != -1)
            return memo[l1][l2];
        if(s1.charAt(l1-1) == s2.charAt(l2-1))
            return minDistanceUtil(s1,s2,l1-1,l2-1,memo);
        int insert = minDistanceUtil(s1,s2,l1,l2-1,memo);
        int delete = minDistanceUtil(s1,s2,l1-1,l2,memo);
        int replace = minDistanceUtil(s1,s2,l1-1,l2-1,memo);
        return memo[l1][l2] = 1 + Math.min(Math.min(insert,replace), delete);
    }
}