class Solution {
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        ArrayList<ArrayList<Integer>> adjlist = new ArrayList<>();
        for(int i=0;i<V;i++){
            adjlist.add(new ArrayList<>());
        }
        
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            adjlist.get(u).add(v);
            adjlist.get(v).add(u);
        }
        
        boolean[] vis = new boolean[V];
        for(int i=0;i<V;i++){
            vis[i] = false;
        }
        for(int i=0;i<V;i++){
            if(!vis[i]){
                if(dfs(adjlist, vis, i, -1)==true) return true;
            }
        }
        return false;
    }
    public boolean dfs(ArrayList<ArrayList<Integer>> adjlist, boolean[] vis, int i, int parent){
        vis[i] = true;
        for(int newnode : adjlist.get(i)){
            if(!vis[newnode]){
                if(dfs(adjlist, vis, newnode, i) == true) return true;
            }
            else if(newnode != parent) return true;
        }
        return false;
    }
}