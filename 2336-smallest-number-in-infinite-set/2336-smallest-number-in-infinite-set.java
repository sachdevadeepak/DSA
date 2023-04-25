class SmallestInfiniteSet 
{
    HashSet<Integer>set;
    PriorityQueue<Integer>pq;
    public SmallestInfiniteSet() 
    {
        set = new HashSet<Integer>();
        pq = new PriorityQueue<Integer>();
        for(int i=1;i<=1000;i++)
        {
            pq.add(i);
        }
    }
    
    public int popSmallest()
    {
        int num = pq.poll();
        set.add(num);
        return num;
    }
    
    public void addBack(int num) 
    {
        if(set.contains(num))
        {
            pq.add(num);
            set.remove(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */