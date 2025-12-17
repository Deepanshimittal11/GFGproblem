class Solution {
    // int n;
    boolean[][] vis ;
    int[][] dir = {{-1,0},{0,-1},{1,0},{0,1}, {-1,1},{1,-1},{1,1},{-1,-1}};
    
    public int countIslands(char[][] grid) {
        // Code here
        int n = grid.length;
        int m = grid[0].length;
        int cnt = 0;
        
        vis = new boolean[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='L' && !vis[i][j]){
                    dfs(grid, i, j);
                    cnt++;
                }
            }
        }
        return cnt;
    }
    
    public void dfs(char[][] grid, int i, int j){
        int n = grid.length;
        int m = grid[0].length;
        // vis = new boolean[n][m];
        
        vis[i][j] = true;
        
        for(int[] dis : dir){
            int ni = i + dis[0];
            int nj = j + dis[1];
            if(ni>=0 && nj>=0 && ni<n && nj<m && grid[ni][nj]=='L' && !vis[ni][nj]) {
                dfs(grid, ni, nj);   
            }
        }
    }
}