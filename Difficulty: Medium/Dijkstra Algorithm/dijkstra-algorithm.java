class Solution {
    public int[] dijkstra(int V, int[][] edges, int src) {
        // code here
        List<List<int[]>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int[] edge : edges){
            int u = edge[0], v=edge[1], w=edge[2];
            adj.get(u).add(new int[]{v,w});
            adj.get(v).add(new int[]{u,w});
        }
        
        long[] dist = new long[V];
        for(int i=0;i<V;i++){
            dist[i] = Long.MAX_VALUE;
        }
        dist[src] = 0;
        
        PriorityQueue<long[]> pq = new PriorityQueue<>((a,b) -> Long.compare(a[0],b[0]));
        pq.offer(new long[]{0,src});
        
        while(!pq.isEmpty()){
            long[] top = pq.poll();
            long d = top[0];
            int node = (int)top[1];
            if(d > dist[node]) continue;
            
            for(int[] neigh : adj.get(node)){
                int next = neigh[0];
                int w = neigh[1];
                
                long newdist = d + w;
                if(newdist < dist[next]){
                    dist[next] = newdist;
                    pq.offer(new long[]{newdist, next});
                }
            }
        }
        
        int[] ans = new int[V];
        for(int i=0;i<V;i++){
            ans[i] = (int)dist[i];
        }
        return ans;
    }
}