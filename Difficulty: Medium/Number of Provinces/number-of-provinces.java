// User function Template for Java
class DisjointSet {
    int[] parent;
    int[] rank;

    // Constructor
    public DisjointSet(int n) {
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
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here
        DisjointSet ds = new DisjointSet(V);
        int m = adj.size();
        int cnt = 0;
        
        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                if(adj.get(i).get(j)==1) ds.unionByRank(i,j);
            }
        }
        for(int i=0;i<V;i++){
            if(ds.parent[i] ==i) cnt++;
        }
        return cnt;
    }
}