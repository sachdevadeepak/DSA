class Solution {
    public int maximumScore(int a, int b, int c) {
        PriorityQueue<Integer>pq = new PriorityQueue<>((x,y) -> y - x);
        pq.add(a);
        pq.add(b);
        pq.add(c);
        int score = 0;
        while(pq.peek() != 0) {
            int num1 = pq.poll();
            int num2 = pq.poll();
            if(num1 <= 0 || num2 <= 0) {
                break;
            }
            score++;
            num1--;
            num2--;
            pq.add(num1);
            pq.add(num2);
        }
        return score;
    }
}