class Solution {
    public int towerOfHanoi(int n, int from, int to, int aux) {
        // code here
        int a = from, b = to, c = aux;
        int cnt = 0;
        
        if(n == 1) return 1;
        
        cnt += towerOfHanoi(n-1, a, c, b);
        cnt++;
        cnt += towerOfHanoi(n-1, c, b, a);
        
        return cnt;
    }
}
