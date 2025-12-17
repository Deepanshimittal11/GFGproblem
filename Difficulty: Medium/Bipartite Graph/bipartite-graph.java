class Solution {
    public boolean isBipartite(int V, int[][] edges) {
        // Code here
        // we will fill color 0 & 1.
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++) adj.add(new ArrayList<>());
        for(int[] e : edges){
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        
        int[] vis = new int[V];
        // for(int i=0;i<V;i++) vis[i] = -1;
        Arrays.fill(vis, -1);
        
        for(int i=0;i<V;i++){
            if(vis[i]==-1) {
                if(dfs(i, adj, vis, 0)==false) return false; //here 0 is the color.
            }
        }
        return true;
    }
    public boolean dfs(int node, ArrayList<ArrayList<Integer>> adj, int[] vis, int color){
        vis[node] = color;
        
        for(int it : adj.get(node)){
            if(vis[it]==-1){
                if(dfs(it, adj, vis, 1-color)==false) return false;
            }
            else if(vis[it]==color) return false;
        }
        return true;
    }
}