class Solution {
    public int equalPairs(int[][] grid) {
        int count = 0;
        int n = grid.length;
        Map<String, Integer> map = new HashMap<>();
        for (int[] row : grid) {
            String str = Arrays.toString(row);
            map.put(str, 1 + map.getOrDefault(str, 0));
        }
        for (int c = 0; c < n; c++) {
            int[] col = new int[n];
            for (int r = 0; r < n; ++r) {
                col[r] = grid[r][c];
            }
            count += map.getOrDefault(Arrays.toString(col), 0);
        }
        return count;
    }
}