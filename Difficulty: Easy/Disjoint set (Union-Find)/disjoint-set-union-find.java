/*Complete the function below*/
class GfG {
    int find(int par[], int x) {
        // add code here.
        if(par[x]==x) return x; //x is parent of it's own.
        return find(par, par[x]);
    }
    
    void unionSet(int par[], int x, int z) {
        // add code here.
        int px = find(par, x);
        int pz = find(par, z);
        if(px != pz) {
            par[px] = pz;  //attach one tree node to another.
        }
    }
}