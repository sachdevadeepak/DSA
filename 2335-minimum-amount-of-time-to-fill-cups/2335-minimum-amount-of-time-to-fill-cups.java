class Solution {
    public int fillCups(int[] amount) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
        pq.add(amount[0]);
        pq.add(amount[1]);
        pq.add(amount[2]);
        int seconds = 0;
        while(pq.peek() != 0) {
            seconds++;
            int high1 = pq.poll() - 1;
            int high2 = pq.poll() - 1;
            pq.add(high1 > 0 ? high1 : 0);
            pq.add(high2 > 0 ? high2 : 0);
        }
        return seconds;
    }
}