class Solution {
    public ArrayList<Integer> findOrder(int n, int[][] prerequisites) {
        // code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int[] e : prerequisites){
            adj.get(e[1]).add(e[0]);
        }
        
        int[] vis = new int[n];
        int[] pathvis = new int[n];
        ArrayList<Integer> ans = new ArrayList<>();
        
        Stack<Integer> st = new Stack<>();
        
        for(int i=0;i<n;i++){
            if(vis[i]==0) {
                dfs(i, adj, vis, pathvis, st);
            }
        }
        
        while(!st.isEmpty()){
            ans.add(st.peek());
            st.pop();
        }
        return ans;
    }
    
    public boolean dfs(int node, ArrayList<ArrayList<Integer>> adj, int[] vis, int[] pathvis, Stack<Integer> st){
        vis[node] = 1;
        pathvis[node] = 1;
        
        for(int it : adj.get(node)){
            if(vis[it]==0){
                if(dfs(it, adj, vis, pathvis, st)) return true;
            }
            else if(pathvis[it]==1) return true;
        }
        st.push(node);
        pathvis[node] = 0;
        return false;
    }
}