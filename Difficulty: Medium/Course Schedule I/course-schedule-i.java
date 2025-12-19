class Solution {
    public boolean canFinish(int n, int[][] prerequisites) {
        // code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int[] e : prerequisites){
            adj.get(e[0]).add(e[1]);
        }
        
        int[] vis = new int[n];
        int[] pathvis = new int[n];
        
        for(int i=0;i<n;i++){
            if(vis[i]==0) {
                if(dfs(i, adj, vis, pathvis)) return false;
            }
        }
        
        return true;
    }
    
    public boolean dfs(int node, ArrayList<ArrayList<Integer>> adj, int[] vis, int[] pathvis){
        vis[node] = 1;
        pathvis[node] = 1;
        
        for(int it : adj.get(node)){
            if(vis[it]==0){
                if(dfs(it, adj, vis, pathvis)) return true;
            }
            else if(pathvis[it]==1) return true;
        }
        
        pathvis[node] = 0;
        return false;
    }
}