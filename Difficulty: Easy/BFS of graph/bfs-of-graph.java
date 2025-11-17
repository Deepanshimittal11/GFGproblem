class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(0);
        
        boolean[] vis = new boolean[adj.size()];
        vis[0] = true;
        
        while(!q.isEmpty()){
            int curr = q.poll();
            ans.add(curr);
            for(int nbr : adj.get(curr)){
                if(!vis[nbr]){
                    q.offer(nbr);
                    vis[nbr] = true;
                }
            }
        }
        return ans;
    }
}