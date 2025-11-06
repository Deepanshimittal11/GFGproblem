class Solution {
    public ArrayList<Integer> safeNodes(int n, int[][] edges) {
        // Code here
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n;i++) graph.add(new ArrayList<>());
        
        int[] indegree = new int[n];
        for(int[] edge : edges){
            int a = edge[0], b = edge[1];
            graph.get(b).add(a);
            indegree[a]++;
        }
        
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0) q.offer(i);
        }
        
        ArrayList<Integer> safenodes = new ArrayList<>();
        while(!q.isEmpty()){
            int node = q.poll();
            safenodes.add(node);
            for(int neigh : graph.get(node)){
                indegree[neigh]--;
                if(indegree[neigh]==0) q.offer(neigh);
            }
        }
        Collections.sort(safenodes);
        return safenodes;
    }
}