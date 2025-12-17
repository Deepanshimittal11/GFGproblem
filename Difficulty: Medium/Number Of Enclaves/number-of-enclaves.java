// User function Template for Java

class Solution {
    int[][] dis = {{-1,0},{1,0},{0,-1},{0,1}};
    
    int numberOfEnclaves(int[][] grid) {

        // Your code here
        int cnt = 0;
        int n = grid.length;
        int m = grid[0].length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 || j==0 || i==n-1 || j==m-1){
                    if(grid[i][j]==1){
                        grid[i][j] = 0;
                        dfs(grid, i, j);
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1) cnt++;
            }
        }
        return cnt;
    }
    int[][] dfs(int[][] grid, int i, int j){
        int n = grid.length;
        int m = grid[0].length;
        
        for(int[] d : dis){
            int ni = i + d[0];
            int nj = j + d[1];
            if(ni>=0 && nj>=0 && ni<n && nj<m && grid[ni][nj]==1){
                grid[ni][nj]=0;
                dfs(grid, ni, nj);
            }
        }
        return grid;
    }
} 