// class Node{
//     int i, j, time;
//     Node(int i, int j, int time){
//         this.i = i;
//         this.j = j;
//         this.time = time;
//     }
// }
class Solution {
    public int orangesRot(int[][] mat) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        
        int fresh = 0;
        int time = 0;
        
        Queue<int[]> q = new LinkedList<>();
        //q.offer(new int[]{0,0,0});
        
        boolean[][] vis = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==2 && !vis[i][j]){
                    vis[i][j] = true;
                    q.offer(new int[]{i,j,0});
                }
                else if(mat[i][j]==1){
                    fresh++;
                }
            }
        }
        
        if(fresh==0) return 0;
        
        int[][] dir = {{-1,0},{0,-1},{0,1},{1,0}};
        
        while(!q.isEmpty()){
            int[] curr = q.poll();
            for(int[] d : dir){
                int ni = curr[0] + d[0];
                int nj = curr[1] + d[1];
                if(ni>=0 && nj>=0 && ni<n && nj<m && mat[ni][nj]==1 && !vis[ni][nj]){
                    q.offer(new int[]{ni, nj, curr[2]+1});
                    mat[ni][nj]=2;
                    vis[ni][nj] = true;
                    fresh--;
                    time = curr[2] + 1;
                }
            }
        }
        return (fresh == 0) ? time : -1;
    }
}