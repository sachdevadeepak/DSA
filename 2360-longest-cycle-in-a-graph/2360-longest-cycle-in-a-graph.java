class Solution {
    public int longestCycle(int[] edges) {
        int longest = -1;
        boolean visited[] = new boolean[edges.length];  
        HashMap<Integer, Integer> map;
        for(int i=0; i<edges.length; i++){
            if(visited[i]) continue;
            int distance = 0, curr_node = i;
            map = new HashMap<>();  
            while(curr_node != -1){
                if(map.containsKey(curr_node)){
                    longest = Math.max(longest, distance - map.get(curr_node));
                    break;
                }
                if(visited[curr_node]) break;
                visited[curr_node] = true;
                map.put(curr_node, distance);
                curr_node = edges[curr_node];
                distance++;
            }
        }
        return longest;
    }
}