// User function Template for Java

class Solution {
    public boolean isPossible(int N, int P, int[][] prerequisites) {
        // Your Code goes here
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<N;i++) graph.add(new ArrayList<>());
        
        int[] indegree = new int[N];
        for(int[] pre : prerequisites){
            int a = pre[0], b = pre[1];
            graph.get(b).add(a);
            indegree[a]++;
        }
        
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<N;i++){
            if(indegree[i]==0) q.offer(i);
        }
        
        int cnt = 0;
        while(!q.isEmpty()){
            int node = q.poll();
            cnt++;
            for(int neigh : graph.get(node)){
                indegree[neigh]--;
                if(indegree[neigh]==0) q.offer(neigh);
            }
        }
        return cnt == N;
    }
}