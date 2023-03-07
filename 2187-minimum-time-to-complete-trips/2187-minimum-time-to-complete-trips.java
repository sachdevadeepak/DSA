class Solution {
    public boolean timeEnoughToCompleteTrips(int[] time, long givenTime, int totalTrips) {
        long actualTrips = 0;
        for (int t : time) 
            actualTrips += givenTime / t;
        return actualTrips >= totalTrips;
    }
    public long minimumTime(int[] time, int totalTrips) {
        int min_time = Integer.MAX_VALUE;
        for (int t : time) {
            min_time = Math.min(min_time, t);
        }
        long left = 1, right = (long) min_time * totalTrips;
        while (left < right) {
            long mid = (left + right) / 2;
            if (timeEnoughToCompleteTrips(time, mid, totalTrips)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}