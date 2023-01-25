class Solution 
{
    public int closestMeetingNode(int[] edges, int node1, int node2) 
    {
    HashMap<Integer, Integer> vis = new HashMap<>();
    int idx = node1, res = -1, min = Integer.MAX_VALUE, dist = 0;
    while(!vis.containsKey(idx) && idx>-1)
    {
        vis.put(idx, dist++);
        idx = edges[idx];
    }
    idx = node2; dist = 0;
    HashMap<Integer, Integer> vis2 = new HashMap<>();
    while(!vis2.containsKey(idx) && idx>-1)
    {
        vis2.put(idx, dist);
        if(vis.containsKey(idx))
        {
            int curr = Math.max(dist, vis.get(idx));
            if(res == -1 || curr<=min)
            {
                res = curr==min ? Math.min(res, idx) : idx;
                min = curr;
            }
        }
        dist++;
        idx = edges[idx];
    }
    return res;
}
}