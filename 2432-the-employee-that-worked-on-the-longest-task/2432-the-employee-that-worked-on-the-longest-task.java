class Solution 
{
    public int hardestWorker(int n, int[][] logs)
    {
        int longest_worked = 0;
        int prev_time = 0;
        int max_till_now = 0;
        for(int[] arr : logs)
        {
            if(arr[1] - prev_time > max_till_now)
            {
                longest_worked = arr[0];
                max_till_now = arr[1] - prev_time;
            }
            else if(arr[1] - prev_time == max_till_now && arr[0] < longest_worked)
            {
                longest_worked = arr[0];
            }
            prev_time = arr[1];
        }
        return longest_worked;
    }
}