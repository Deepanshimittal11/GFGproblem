class Node{
    int adj_node, par_node;
    Node(int adj_node, int par_node){
        this.adj_node = adj_node;
        this.par_node = par_node;
    }
}
class Solution {
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        ArrayList<ArrayList<Integer>> adjlist = new ArrayList<>();
        for(int i=0;i<V;i++){
            adjlist.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            adjlist.get(u).add(v);
            adjlist.get(v).add(u);
        }
        
        boolean[] vis = new boolean[V];
        for(int i=0;i<V;i++){
            vis[i] = false;
        }
        for(int i=0;i<V;i++){
            if(vis[i]==false){
                if(bfs(adjlist, vis, i, V)==true) return true;
            }
        }
        return false;
    }
    public boolean bfs(ArrayList<ArrayList<Integer>> adjlist, boolean[] vis, int i, int V){
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(i, -1));
        vis[i] = true;
        
        while(!q.isEmpty()){
            Node curr = q.poll();
            int node = curr.adj_node;
            int parent = curr.par_node;
            for(int newnode : adjlist.get(node)){
                if(!vis[newnode]){
                    vis[newnode] = true;
                    q.offer(new Node(newnode, node));
                }
                else if(parent != newnode){
                    return true;
                }
            }
        }
        return false;
    }
}