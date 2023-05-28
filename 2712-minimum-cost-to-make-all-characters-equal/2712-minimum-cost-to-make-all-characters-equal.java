class Solution {
     public long minimumCost(String s) {
        long minCost = 0;
        int len = s.length();
        for (int i = 1;i < len;i++)
            if (s.charAt(i) != s.charAt(i - 1))
                minCost += Math.min(i,len - i);
        return minCost;
    }
}