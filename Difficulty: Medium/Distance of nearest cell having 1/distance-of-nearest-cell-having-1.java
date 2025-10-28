class Solution {
    public ArrayList<ArrayList<Integer>> nearest(int[][] grid) {
        // code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int row = grid.length;
        int col = grid[0].length;
        
        Queue<int[]> q = new LinkedList<>();
        
        for(int i=0;i<row;i++){
            ArrayList<Integer> ans = new ArrayList<>();
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                    ans.add(0);
                    q.offer(new int[]{i,j});
                }else{
                    ans.add(-1);
                }
            }
            res.add(ans);
        }
        
        int[][] dir = {{0,-1},{0,1},{1,0},{-1,0}};
        
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int r = curr[0], c = curr[1];
            for(int[] d : dir){
                int nr = r + d[0];
                int nc = c + d[1];
                if(nr>=0 && nc>=0 && nr<row && nc<col && res.get(nr).get(nc)==-1){
                    res.get(nr).set(nc, res.get(r).get(c)+1);
                    q.offer(new int[]{nr, nc});   
                }
            }
        }
        return res;
    }
}