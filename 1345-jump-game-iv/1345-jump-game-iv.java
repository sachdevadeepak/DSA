class Solution 
{
    public int minJumps(int[] arr) 
    {
        int n = arr.length;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++)
            map.computeIfAbsent(arr[i], x -> new LinkedList<>()).add(i);
        boolean[] visited = new boolean[n];
        visited[0] = true;
        Queue<Integer> q = new LinkedList<>(); 
        q.offer(0);
        int step = 0;
        while (!q.isEmpty())
        {
            for (int size = q.size(); size > 0; --size) 
            {
                int i = q.poll();
                if (i == n - 1)
                    return step; 
                List<Integer> list = map.get(arr[i]);
                list.add(i - 1); 
                list.add(i + 1);
                for (int j : list) {
                    if (j >= 0 && j < n && !visited[j]) 
                    {
                        visited[j] = true;
                        q.offer(j);
                    }
                }
                list.clear(); 
            }
            step++;
        }
        return 0;
    }
}