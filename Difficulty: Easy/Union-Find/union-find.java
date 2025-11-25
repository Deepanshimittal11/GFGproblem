// User function Template for Java

class Solution {
    public int find(int x, int par[]){
        if(x==par[x]) return x;
        return par[x] = find(par[x], par);
    }
    
    // Function to merge two nodes a and b.
    public void union_(int a, int b, int par[], int rank[]) {
        // add your code here
        int pa = find(a, par);
        int pb = find(b, par);
        if(pa == pb) return; 
        if(rank[pa]>rank[pb]){
            par[pb] = pa;
        }else if(rank[pa]<rank[pb]){
            par[pa] = pb;
        }else{
            par[pa] = pb;
            rank[pa]++;
        }
    }

    // Function to check whether 2 nodes are connected or not.
    public Boolean isConnected(int a, int b, int par[], int rank[]) {
        // add your code here
        return find(a, par) == find(b, par);
    }
}