class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int[][] a = new int[nums1.length][2];
        for(int i=0;i<nums1.length;i++){
            a[i][0]=nums1[i]; 
            a[i][1]=nums2[i];
        }
        Arrays.sort(a,(a1,b1) -> b1[1]==a1[1]?Integer.compare(b1[0],a1[0]):Integer.compare(b1[1],a1[1]));
        PriorityQueue<int[]> queue = new PriorityQueue<>((a1,b1)->Integer.compare(a1[0],b1[0]));
        int min=Integer.MAX_VALUE;
        long sum=0, res=0;
        for(int i=0;i<k;i++){
            min=Math.min(min,a[i][1]);  
            sum+=a[i][0]; 
            queue.add(a[i]); 
        }
        res=Math.max(res,sum*min);
        for(int i=k;i<a.length;i++){
            if(queue.peek()[0]<a[i][0]){
              sum-=queue.remove()[0];
              sum+=a[i][0];
              queue.add(a[i]);
              min=Math.min(min,a[i][1]); 
            }
            res=Math.max(res,sum*min); 
        }
        return res;
    }
}