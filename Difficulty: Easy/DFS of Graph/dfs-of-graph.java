class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] vis = new boolean[adj.size()];
        helper(adj, 0, ans, vis);
        return ans;
    }
    public void helper(ArrayList<ArrayList<Integer>> adj, int src, ArrayList<Integer> ans, boolean[] vis){
        vis[src] = true;
        ans.add(src);
        for(int nbr : adj.get(src)){
            if(!vis[nbr]){
                helper(adj, nbr, ans, vis);
            }
        }
    }
}