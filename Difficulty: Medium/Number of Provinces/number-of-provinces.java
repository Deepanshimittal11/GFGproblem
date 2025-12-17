// User function Template for Java

class Solution {
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here
        boolean[] vis = new boolean[V];
        int cnt = 0;
        for(int i=0;i<V;i++){
            if(!vis[i]){
                dfs(adj, V, vis, i);
                cnt++;
            }
        }
        return cnt;
    }
    static void dfs(ArrayList<ArrayList<Integer>> adj, int V, boolean[] vis, int node){
        vis[node] = true;
        for(int i=0;i<V;i++){
            if(adj.get(node).get(i)==1 && !vis[i]){
                dfs(adj, V, vis, i);
            }
        }
         
    }
}