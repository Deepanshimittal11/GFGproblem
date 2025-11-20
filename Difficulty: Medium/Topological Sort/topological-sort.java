class Solution {
    public void dfs(int node, int[] vis, Stack<Integer> st, ArrayList<ArrayList<Integer>> adj){
        vis[node] = 1;
        for(int it : adj.get(node)){
            if(vis[it]==0){
                dfs(it, vis, st, adj);
            }
        }
        st.push(node);
    }
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] e : edges){
            adj.get(e[0]).add(e[1]);
        }
        
        Stack<Integer> st = new Stack<>();
        int[] vis = new int[V];
        
        for(int i=0;i<V;i++){
            if(vis[i] == 0){
                dfs(i, vis, st, adj);
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        while(!st.isEmpty()){
            ans.add(st.pop());
        }
        
        return ans;
    }
}