class Solution {
    int n, m;
    public boolean isWordExist(char[][] mat, String word) {
        // Code here
        n = mat.length;
        m = mat[0].length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(found(mat, word, i, j, 0)) return true;
            }
        }
        return false;
    }
    public boolean found(char[][] mat, String word, int i, int j, int index){
        if(index == word.length()) return true;
        if(i<0 || j<0 || i>=n || j>=m || mat[i][j]!=word.charAt(index)) return false;
        
        char temp = mat[i][j];
        mat[i][j] = '#';
        
        boolean wordFound =  found(mat, word, i+1, j, index+1) || 
            found(mat, word, i-1, j, index+1) || 
            found(mat, word, i, j+1, index+1) ||
            found(mat, word, i, j-1, index+1);
            
        mat[i][j] = temp;
        return wordFound;
    }
}