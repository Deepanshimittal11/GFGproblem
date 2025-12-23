class Disjoint {
    int[] parent;
    int[] rank;
    
    // Constructor
    public Disjoint(int n) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;  // initially, each node is its own parent
            rank[i] = 0;    // all ranks start at 0
        }
    }

    // Find ultimate parent (with path compression)
    public int findParent(int node) {
        if (node == parent[node])
            return node;
        return parent[node] = findParent(parent[node]);  // path compression
    }

    // Union by Rank
    public void unionByRank(int u, int v) {
        int pu = findParent(u);
        int pv = findParent(v);

        if (pu == pv) return;  // already in the same set

        if (rank[pu] < rank[pv]) {
            parent[pu] = pv;
        } else if (rank[pv] < rank[pu]) {
            parent[pv] = pu;
        } else {
            parent[pv] = pu;
            rank[pu]++;  // increase rank if both are same
        }
    }
}
class Solution {
    public int minConnect(int V, int[][] edges) {
        // code here
        Disjoint ds = new Disjoint(V);
        int cntExtra = 0; // cnt extra edges 
        int m = edges.length;
        
        for(int i=0;i<m;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            if(ds.findParent(u) == ds.findParent(v)){
                cntExtra++;
            }
            else{
                ds.unionByRank(u, v);
            }
        }
        
        int cntC = 0;  //cnt unique components.
        for(int i=0;i<V;i++){
            if(ds.parent[i] == i) cntC++;
        }
        int ans = cntC-1;  //cnt edges for the connection.
        if(cntExtra >= ans){
            return ans;
        }
        return -1;
    }
}
