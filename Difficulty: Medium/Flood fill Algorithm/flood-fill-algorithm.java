class Solution {
    boolean[][] vis;
    int[][] dir = {{-1,0},{0,1},{0,-1},{1,0}};
    
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // code here
        int n = image.length;
        int m = image[0].length;
        vis = new boolean[n][m];
        
        int oldColor = image[sr][sc];
        image[sr][sc] = newColor;
        
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         if(image[i][j] == newColor && !vis[i][j]){
        //             dfs(image, i, j, newColor);
        //         }
        //     }
        // }
        dfs(image, sr, sc,newColor, oldColor);
        
        return image;
    }
    public void dfs(int[][] image, int i, int j, int newColor, int oldColor){
        int n = image.length;
        int m = image[0].length;
        vis[i][j] = true;
        
        for(int[] d : dir){
            int ni = i + d[0];
            int nj = j + d[1];
            if(ni>=0 && nj>=0 && ni<n && nj<m && image[ni][nj]==oldColor && !vis[ni][nj]){
                oldColor = image[ni][nj];
                image[ni][nj] = newColor;
                dfs(image, ni, nj, newColor, oldColor);
            }
        }
    }
}