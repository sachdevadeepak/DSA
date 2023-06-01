class Solution {
    private int dir[][] = new int[][]{{0,1},{0,-1},{1,0},{-1,0},{1,-1},{-1,1},{-1,-1},{1,1}};
    public int shortestPathBinaryMatrix(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        if(grid[0][0]==1 || grid[m-1][n-1]==1) {
            return -1;
        }
        boolean[][] visited = new boolean[m][n];
        visited[0][0] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0});
        int res=0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while(size-->0) {
                int[] point = queue.remove();
                if(point[0]==m-1 && point[1]==n-1) {
                    return res+1;
                }
                for (int k=0;k<8;k++) {
                    int x = dir[k][0]+point[0];
                    int y = dir[k][1]+point[1];
                    if(x>=0 && x<m && y>=0 && y<n && !visited[x][y] && grid[x][y]==0) {
                        queue.add(new int[]{x,y});
                        visited[x][y]=true;
                    }
                }
            }
            res++;
        }
        return -1;
    }
}