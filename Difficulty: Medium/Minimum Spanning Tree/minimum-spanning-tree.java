class Solution {
    public int spanningTree(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] e : edges){
            adj.get(e[0]).add(new int[]{e[1],e[2]});
            adj.get(e[1]).add(new int[]{e[0],e[2]});
        }
        
        int[] vis = new int[V];
        int sum = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0]-b[0]);
        pq.add(new int[]{0,0}); // {wt,node}
        
        while(pq.size()>0){
            int[] curr = pq.poll();
            int wt = curr[0];
            int node = curr[1];
            
            if(vis[node]==1) continue; //already visited.
            vis[node] = 1; //marks it as visited.
            sum += wt;
            
            for(int[] i : adj.get(node)){
                int newWt = i[1];
                int adjnode = i[0];
                if(vis[adjnode]==0) pq.add(new int[]{newWt, adjnode});
            }
        }
        return sum;
    }
}
