class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone : stones) {
            pq.add(stone);
        }
        while(pq.size() >= 2) {
            int heavy = pq.poll();
            int light = pq.poll();
            if(heavy > light) {
                pq.add(heavy - light);
            }
        }
        if(pq.size() == 0) {
            return 0;
        }
        else {
            return pq.poll();
        }
    }
}