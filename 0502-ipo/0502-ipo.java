public class Solution {
    public int findMaximizedCapital(int k, int W, int[] Profits, int[] Capital) {
        PriorityQueue<int[]> capital = new PriorityQueue<>((a, b) -> (a[0] - b[0]));
        PriorityQueue<int[]> profit = new PriorityQueue<>((a, b) -> (b[1] - a[1]));
        
        for (int i = 0; i < Profits.length; i++) {
            capital.add(new int[] {Capital[i], Profits[i]});
        }
        
        for (int i = 0; i < k; i++) {
            while (!capital.isEmpty() && capital.peek()[0] <= W) {
                profit.add(capital.poll());
            }
            
            if (profit.isEmpty()) break;
            
            W += profit.poll()[1];
        }
        
        return W;
    }
}