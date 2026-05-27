class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> adjlist = new ArrayList<>();
        for(int i=0;i<V;i++){
            adjlist.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            adjlist.get(u).add(v);
        }
        
        int[] vis = new int[V];
        int[] pathvis = new int[V];
        for(int i=0;i<V;i++){
            vis[i] = 0;
            pathvis[0] = 0; 
        }
        
        for(int i=0;i<V;i++){
            if(vis[i]==0){
                if(dfs(adjlist, vis, pathvis, i, V)==true) return true;
            }
        }
        return false;
    }
    public boolean dfs(ArrayList<ArrayList<Integer>> adjlist, int[] vis, int[] pathvis, int i, int V){
        vis[i] = 1;
        pathvis[i] = 1;
        
        for(int newnode : adjlist.get(i)){
            if(vis[newnode]==0){
                if(dfs(adjlist, vis, pathvis, newnode, V)==true) return true;
            }
            else if(pathvis[newnode]==1) return true;
        }
        
        pathvis[i] = 0;
        return false;
    }
}













