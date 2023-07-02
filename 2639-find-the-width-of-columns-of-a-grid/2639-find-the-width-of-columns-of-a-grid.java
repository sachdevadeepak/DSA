class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int res[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int maxWidth=0;
            for(int j=0;j<m;j++)
            {
                maxWidth=Math.max(maxWidth,String.valueOf(grid[j][i]).length());
            }
            res[i]=maxWidth;
        }
        return res;
    }
}