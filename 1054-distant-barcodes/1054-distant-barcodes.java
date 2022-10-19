class Solution 
{
    public int[] rearrangeBarcodes(int[] barcodes) 
    {
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : barcodes) map.put(x, map.getOrDefault(x, 0) + 1);
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for (int x : map.keySet())
        {
            queue.add(new int[]{x, map.get(x)});
        }
        int[] res = new int[barcodes.length];
        int i = 0;
        while (!queue.isEmpty())
        {
            int[] tmp = queue.poll();
            while (tmp[1]-- > 0)
            {
                res[i] = tmp[0];
                i += 2;
                if (i >= barcodes.length) i = 1;
            }
        }
        return res;
    }
}