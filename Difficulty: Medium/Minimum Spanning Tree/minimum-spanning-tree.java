class disjoint{
    int[] parent, rank;
    
    disjoint(int n){
        parent = new int[n];
        rank = new int[n];
        
        for(int i=1;i<n;i++){
            parent[i] = i;
            rank[i] = 0;
        }
    }
    
    int find(int x){
        if(parent[x] == x) return x;
        return parent[x] = find(parent[x]);
    }
    
    void unionset(int x, int y){
        int px = find(x);
        int py = find(y);
        
        if(px==py) return;
        
        if(parent[px]<parent[py]) parent[px]=py;
        else if(parent[py]<parent[px]) parent[py]=px;
        else{
            parent[py] = px;
            rank[px]++;
        }
    }
}

class Solution {
    public int spanningTree(int V, int[][] edges) {
        // code here
        //sort array by their weight.
        Arrays.sort(edges, (a,b) -> (a[2]-b[2]));
        
        disjoint ds = new disjoint(V);
        int finalwght = 0;
        int cnt = 0;
        
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];
            
            if(ds.find(u) != ds.find(v)){
                ds.unionset(u,v);
                finalwght += wt;
                cnt++;
            }
            if(cnt == V-1) break;
        }
        return finalwght;
    }
}
